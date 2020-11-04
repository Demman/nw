package com.web.service.impl;

import com.web.bean.User;
import com.web.dao.login.LoginDao;
import com.web.form.UserForm;
import com.web.service.LoginService;
import com.web.unit.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoginServiceImpl implements LoginService {
   @Autowired
   LoginDao loginDao;
   @Autowired
   private RedisTemplate<String,Object> redisTemplate;
   @Autowired
   RedisUtil redisUtil;
   final long EXPIRETIME =24*60*60;//自定义redis缓存时间一天
   @Override
   public User login(UserForm userform) {
      User user=(User)redisUtil.get("user");
     // user= (User) redisTemplate.opsForValue().get("user");
      if (user==null){
          user=loginDao.login(userform);
          //redisTemplate.opsForValue().set("user",user);
         redisUtil.set("user",user,EXPIRETIME);
      }else{
         redisUtil.expire("user",EXPIRETIME);
      }
      List list=new ArrayList();
      list.add(user);
      list.add(user);
      redisUtil.set("userlist",list,EXPIRETIME);
      List list1= (List) redisUtil.get("userlist");
      System.out.println(list1.get(1));
      return user;
   }
}

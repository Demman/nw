package com.web.dao.login;

import com.web.bean.User;
import com.web.form.UserForm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author:hch
 * @Date: 2020年10月15日 14:42:00
*/
@Mapper
@Repository
public interface LoginDao {
    User login(UserForm userform);
}

package com.web.service;


import com.web.bean.User;
import com.web.form.UserForm;
/**
 * @Author:hch
 * @Date: 2020年10月15日 14:42:00
 */
public interface LoginService {
    User login(UserForm userform);
}

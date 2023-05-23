package com.example.ttms.service;


import com.example.ttms.pojo.UserCustomer;

import java.util.List;

/**
 * 用户注册账号
 */
public interface UserCustomerService {

    List<UserCustomer> list();
    void add(UserCustomer userCustomer);
}

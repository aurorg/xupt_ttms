package com.example.ttms.service.impl;

import com.example.ttms.dao.UserCustomerMapper;
import com.example.ttms.pojo.UserCustomer;
import com.example.ttms.service.UserCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCustomerServiceImpl implements UserCustomerService {


    @Autowired
    private UserCustomerMapper userCustomerMapper;

    @Override
    public List<UserCustomer> list(){
        List<UserCustomer> userCustomerList =userCustomerMapper.list();
        return userCustomerList;
    }




    @Override
    public void add(UserCustomer userCustomer){

    }
}

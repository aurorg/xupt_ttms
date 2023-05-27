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
    /**
     * 查询所有顾客
     * @return
     */
    @Override
    public List<UserCustomer> list(){
//         List<UserCustomer> userCustomerList =userCustomerMapper.list();
//        System.out.println(userCustomerMapper.list()+"000000000000000000000000000");
        return userCustomerMapper.list();
    }

//    @Override
//    public void add(UserCustomer userCustomer){
//
//    }


}

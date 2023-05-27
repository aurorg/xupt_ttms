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
     */
    @Override
    public List<UserCustomer> list(){
//         List<UserCustomer> userCustomerList =userCustomerMapper.list();
//        System.out.println(userCustomerMapper.list()+"000000000000000000000000000");
        return userCustomerMapper.list();
    }

    /**
     * 顾客注册账户
     * @param userCustomer
     */
    @Override
    public void add(UserCustomer userCustomer){
        userCustomer.setCusBalance(0.00);
        userCustomer.setCusStatus(1);

        userCustomerMapper.insert(userCustomer);
    }


    /**
     *
     * @param id
     */
    @Override
    public void delete(Integer id){
        userCustomerMapper.deleteById(id);
    }


}

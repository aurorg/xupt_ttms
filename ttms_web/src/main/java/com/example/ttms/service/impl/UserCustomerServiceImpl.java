package com.example.ttms.service.impl;

import com.example.ttms.dao.UserCustomerMapper;
import com.example.ttms.pojo.UserCustomer;
import com.example.ttms.service.UserCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
         List<UserCustomer> userCustomerList =userCustomerMapper.list();
//        System.out.println(userCustomerMapper.list()+"000000000000000000000000000");

         userCustomerList.stream().forEach(userCustomer -> {
                    //处理 gender 1: 男, 2: 女
                    String gender = userCustomer.getCusGender();
                    if("1".equals(gender)){
                        userCustomer.setCusGender("男");
                    }else if("2".equals(gender)){
                        userCustomer.setCusGender("女");
                    }
         });
//        return userCustomerMapper.list();
        return userCustomerList;
    }

    /**
     * 用户修改个人信息
     * @param userCustomer
     * @return
     */
    @Override
    public void update(UserCustomer userCustomer){
        if(userCustomer.getCusGender().equals("男")){
            userCustomer.setCusGender("1");
        }
        if(userCustomer.getCusGender().equals("女")){
            userCustomer.setCusGender("2");
        }

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

package com.example.ttms.dao;


import com.example.ttms.pojo.UserCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserCustomerMapper {

    //查询所有客户的信息
    @Select("select * from customer")
    List<UserCustomer> list();

}

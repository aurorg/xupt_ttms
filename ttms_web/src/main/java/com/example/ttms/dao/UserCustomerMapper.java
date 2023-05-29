package com.example.ttms.dao;


import com.example.ttms.pojo.UserCustomer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserCustomerMapper {

    /**
     * 查询所有客户的信息
     */

    @Select("select cus_id, cus_name, cus_gender, cus_telnum, cus_email, cus_uid, cus_pwd, cus_payPwd, cus_balance, cus_status from TTMS.customer")
    List<UserCustomer> list();

    /**
     *
     * @param userCustomer
     */
    @Insert("insert into TTMS.customer(cus_name, cus_gender, cus_telnum, cus_email, cus_uid, cus_pwd, cus_payPwd, cus_balance, cus_status) " +
            "values(#{cusName},#{cusGender},#{cusTelnum},#{cusEmail},#{cusUid},#{cusPwd},#{cusPayPwd},#{cusBalance},#{cusStatus})")
    void insert(UserCustomer userCustomer);


    /**
     *
     * @param id
     */
    @Delete("delete from TTMS.customer where cus_id=#{id}")
    void deleteById(Integer id);


    @Update("update TTMS.customer set cus_name=#{cusName},cus_gender=#{cusGender},cus_telnum = #{cusTelnum},cus_email = #{cusEmail},cus_uid = #{cusUid},cus_pwd = #{cusPwd} WHERE cus_id = #{cusId}")
    void update(UserCustomer userCustomer);

}

package com.example.ttms.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCustomer {
    private Integer cusId;  //主键
    private String cusName;  //姓名
    private String cusGender;  //性别
    private String cusTelnum;  //电话
    private String cusEmail;   //邮箱
    private String cusUid;     //用户名
    private String cusPwd;     //密码
    private String cusPayPwd;   //支付密码
    private double cusBalance;  //账户余额
    private Integer cusStatus;   //状态

}
//    create table customer
//        (
//                cus_id      int auto_increment
//                primary key,
//                cus_name    varchar(100) null,
//        cus_gender  smallint     null,
//        cus_telnum  varchar(30)  not null,
//        cus_email   varchar(100) null,
//        cus_uid     varchar(20)  null,
//        cus_pwd     varchar(20)  null,
//        cus_payPwd  varchar(20)  null,
//        cus_balance decimal      null,
//        cus_status  smallint     null,
//        constraint cus_telnum
//        unique (cus_telnum)
//        );


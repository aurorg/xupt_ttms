package com.example.ttms.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCustomer {
    private Integer cus_id;
    private String cus_name;
    private Integer cus_gender;
    private String cus_telnum;
    private String cus_email;
    private String cus_uid;
    private String csu_pwd;
    private String cus_payPwd;
    private String cus_balance;  //
    private Integer cus_status;





}

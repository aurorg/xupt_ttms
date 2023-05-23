package com.example.ttms.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCustomer {

    private  Integer emp_id; //主键
    private String emp_role;
    private String emp_no;
    private String emp_name;
    private Integer emp_gender;
    private String phone;
    private String email;
    private String emp_pwd;
    private String emp_status;

}

package com.example.ttms.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEmployee {
    private  Integer empId; //主键
    private String empRole;
    private String empNo;
    private String empName;
    private Integer empGender;
    private String phone;
    private String email;
    private String empPwd;
    private String empStatus;
}

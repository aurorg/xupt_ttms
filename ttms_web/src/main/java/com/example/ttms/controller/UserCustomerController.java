package com.example.ttms.controller;

import com.example.ttms.pojo.Result;
import com.example.ttms.pojo.UserCustomer;
import com.example.ttms.service.UserCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 客户账号管理controller
 */
@Slf4j
@RestController
public class UserCustomerController {
   @Autowired
    private UserCustomerService userCustomerService;

    /**查
     * 查询顾客账号
     */
    @GetMapping("/usercustomersget")
    public Result list(){
        log.info("查询所有的顾客账号");
        //调用Service查询部门数据
        List<UserCustomer> userCustomerList =userCustomerService.list();
        return Result.success(userCustomerList);
    }

    /**增
     * 注册顾客账号
     */
    @PostMapping("/usercustomerspost")
    public Result add(@RequestBody UserCustomer userCustomer){
        log.info("顾客注册账号：{}",userCustomer);
        //调用Service新增顾客账号
        userCustomerService.add(userCustomer);
        return Result.success();
    }




}



//增
//    @PostMapping("/usercustomerpost")
//    public Result add(@RequestBody UserCustomer userCustomer){
//        //记录日志
//        log.info("客户注册账号：{}",userCustomer);
//        //调用service的添加功能
//        userCustomerService.add(userCustomer);
//        //响应
//        return Result.success();
//    }


//删



//改




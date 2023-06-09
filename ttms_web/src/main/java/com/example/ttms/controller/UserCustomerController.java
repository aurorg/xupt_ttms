package com.example.ttms.controller;

import com.example.ttms.pojo.Result;
import com.example.ttms.pojo.UserCustomer;
import com.example.ttms.service.UserCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 客户账号管理controller
 */
@Slf4j
@RestController
public class UserCustomerController {
   @Autowired
    private UserCustomerService userCustomerService;

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

    /**删
     * 员工根据id删除顾客账号
     * @param id
     * @return
     */
    @DeleteMapping( "/usercustomersdelete/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("员工根据id删除顾客账号：{}",id);
        //调用Service删除顾客账号
        userCustomerService.delete(id);
        return Result.success();
    }


    /**
     * 改
     * @param userCustomer
     * @return
     */
    @PutMapping("/usercustomersput")
    public Result update(@RequestBody UserCustomer userCustomer){
        log.info("根据id顾客修改自己的个人信息：{}",userCustomer);
        //调用Service修改顾客信息
        userCustomerService.update(userCustomer);
        return Result.success();
    }


    /**查
     * 员工查询顾客账号
     */
    @CrossOrigin(origins = "http://localhost:8088")
    @GetMapping("/usercustomersget")
    public Result list(){
        log.info("员工查询所有的顾客账号");
        //调用Service查询部门数据
        List<UserCustomer> userCustomerList =userCustomerService.list();
        return Result.success(userCustomerList);
    }



}










package com.dayee.controller;

import com.dayee.entity.User;
import com.dayee.service.UserService;

import com.dayee.test01.mapper.UserMapperTest01;
import com.dayee.test02.mapper.UserMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuruanshun on 2019/9/5.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapperTest01 userMapperTest01;

    @Autowired
    private UserMapperTest02 userServiceTest02;

    @RequestMapping("/addUser1")
    public String insertUserTest1(String name, Integer age) {
        userMapperTest01.insert(name, age);
        return "addUser1成功!";
    }

    @RequestMapping("/addUser2")
    public String insertUserTest2(String name, Integer age) {

        userServiceTest02.insert(name, age);
        return "addUser2成功!";
    }


    /*@Autowired
    private UserService userService;

    @Autowired
    private UserMapperTest01 userMapperTest01;

    @Autowired
    private UserMapperTest02 userMapperTest02;

    @RequestMapping(value = "/getUserByName")
    public String getUserByName(String name){
        User user = userService.getUserByName(name);
        System.out.println(user);
        return "getUserByName成功!";
    }

    @RequestMapping(value = "/addUser1")
    public String addUser1(String name,Integer age){
        userMapperTest01.insert(name,age);
        return "addUser1成功!";
    }

    @RequestMapping(value = "/addUser2")
    public String addUser2(String name,Integer age){
        userMapperTest02.insert(name,age);
        return "addUser2成功!";
    }*/
}

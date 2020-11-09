package com.fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fit.service.UserService;

@RestController
@RequestMapping("/testBoot")
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.sel(id).toString();
    }
}

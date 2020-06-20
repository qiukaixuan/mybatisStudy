package com.study.mybatis.controller;

import com.study.mybatis.entity.Employ;
import com.study.mybatis.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {
    @Autowired
    EmployService employService;

    @RequestMapping("getEmploy")
    public Employ getEmployById() {
        return employService.getEmployById(1);
    }
}

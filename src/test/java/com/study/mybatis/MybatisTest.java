package com.study.mybatis;

import com.study.mybatis.entity.Employ;
import com.study.mybatis.service.EmployService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    @Autowired
    EmployService employService;

    @Test
    public void getEmploy() {
        Employ employ = employService.getEmployById(1);
        System.out.println(employ);
    }
}

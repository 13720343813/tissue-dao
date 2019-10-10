package com.cn.service;

import com.cn.entities.mysql.Department;
import com.cn.entities.mysql.User;
import com.cn.util.Json;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {
    @Autowired
    private IUserService userService;

    @Test
    public void update(){
        User user = userService.fetchById(2);
        System.out.println(Json.toJson(user));
        Department department = new Department();
        department.setId(4);
        department.setName("商品部");
        user.setDepartment(department);
        System.out.println(Json.toJson(user));
        userService.update(user);
    }

    @Test
    public void fetchById(){
        System.out.println(Json.toJson(userService.fetchById(1)));
    }
}

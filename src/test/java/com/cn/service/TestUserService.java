package com.cn.service;

import com.cn.entities.mysql.Department;
import com.cn.entities.mysql.User;
import com.cn.util.Json;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {
    @Autowired
    private IUserService userService;

    @Test
    public void create() {
        User user = new User();
//      模拟数据库查询部门信息
        Department department = new Department();
        department.setId(4);
        department.setName("商品部");
        user.setDepartment(department);
        user.setName("张三");
        user.setPassword("123456");
        user.setIdentifyType(0);
        user.setIdentifyNumber("420612345678910001");
        userService.save(user);
    }

    @Test
    public void update() {
        User user = userService.fetchById(2);
        System.out.println(Json.toJson(user));
//      模拟数据库查询部门信息
        Department department = new Department();
        department.setId(4);
        department.setName("商品部");
        user.setDepartment(department);
        System.out.println(Json.toJson(user));
        userService.update(user);
    }

    @Test
    public void batchCreate() {
        Department department = new Department();
        department.setId(4);
        department.setName("商品部");
        Integer size = 50000;
        for (int k = 1; k <= 100; k++) {
            List<User> userList = new ArrayList<>();
            for (int i = (k - 1) * size; i < k * size; i++) {
                User user = new User();
                user.setName("zhang" + i);
                user.setPassword("123456");
                user.setDepartment(department);
                user.setIdentifyType(0);
                user.setIdentifyNumber("42061234567891000" + i);
                userList.add(user);
            }
            userService.batchSave(userList);
        }

    }

    @Test
    public void fetchById() {
        System.out.println(Json.toJson(userService.fetchById(1)));
    }
}

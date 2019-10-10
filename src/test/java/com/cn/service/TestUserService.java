package com.cn.service;

import com.cn.util.Json;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {
    @Autowired
    private IUserService userService;

    @Test
    public void update(){
        Map<String,Object> update = new HashMap<>();
        update.put("id",3);
        update.put("name","赵六");
        update.put("deptId",5);
        userService.update(update);
    }

    @Test
    public void fetchById(){
        System.out.println(Json.toJson(userService.fetchById(3)));
    }
}

package com.cn.controller;

import com.cn.common.ServiceResponse;
import com.cn.common.ServiceResponseCode;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("fetchList")
    public ServiceResponse fetchList(@RequestBody Map<String,Object> query){
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setResult(userService.fetchCollection(query));
        } catch (Exception e) {
            e.printStackTrace();
            serviceResponse.setCode(ServiceResponseCode.SERVER_ERROR);
            serviceResponse.setDescription(e.getMessage());
        }
        return serviceResponse;
    }
}

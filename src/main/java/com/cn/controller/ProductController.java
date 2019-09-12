package com.cn.controller;

import com.cn.common.ServiceResponse;
import com.cn.common.ServiceResponseCode;
import com.cn.entities.Product;
import com.cn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("fetchList")
    public ServiceResponse fetchList(@RequestBody Map<String, Object> request) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setResult(productService.fetchCollection(request));
        } catch (Exception e) {
            e.printStackTrace();
            serviceResponse.setCode(ServiceResponseCode.SERVER_ERROR);
            serviceResponse.setDescription(e.getMessage());
        }
        return serviceResponse;
    }

    @RequestMapping("saveOrUpdate")
    public ServiceResponse saveOrUpdate(@RequestBody Product product) {
        ServiceResponse serviceResponse = new ServiceResponse();
        try {
            serviceResponse.setResult(productService.saveOrUpdate(product));
        } catch (Exception e) {
            e.printStackTrace();
            serviceResponse.setCode(ServiceResponseCode.SERVER_ERROR);
            serviceResponse.setDescription(e.getMessage());
        }
        return serviceResponse;
    }
}

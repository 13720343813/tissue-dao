package com.cn.service;

import com.cn.entities.mongo.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {
    public Product findById(Long id);

    public List<Product> fetchCollection(Map<String, Object> requestArgs);

    public Long fetchCollectionCount(Map<String, Object> requestArgs);

    public Boolean saveOrUpdate(Product product);

    public Boolean update(Map<String, Object> updates);
}

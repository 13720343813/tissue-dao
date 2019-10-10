package com.cn.service.impl;

import com.cn.dao.MongoDao;
import com.cn.entities.mongo.Product;
import com.cn.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private MongoDao productDao;

    public Product findById(Long id){
        return (Product) productDao.findById(id);
    }

    public List<Product> fetchCollection(Map<String, Object> requestArgs) {
        return productDao.fetchCollection(requestArgs);
    }

    public Long fetchCollectionCount(Map<String, Object> requestArgs) {
        return productDao.fetchCollectionCount(requestArgs);
    }

    public Boolean saveOrUpdate(Product product) {
        try {
            if (null == product) {
                return false;
            }
            return productDao.saveOrUpdate(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(Map<String,Object> updates){
        return productDao.update(updates);
    }
}

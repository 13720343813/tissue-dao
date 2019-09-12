package com.cn.config;

import com.cn.dao.MongoDao;
import com.cn.entities.Product;
import com.cn.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoTemplateConfig {
    @Bean
    public MongoDao userDao(){
        return new MongoDao(User.class);
    }

    @Bean
    public MongoDao productDao(){
        return new MongoDao(Product.class);
    }
}

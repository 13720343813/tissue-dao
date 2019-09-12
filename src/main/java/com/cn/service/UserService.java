package com.cn.service;

import com.cn.dao.MongoDao;
import com.cn.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    public MongoDao userDao;

    public User findById(Long id){
        return (User) userDao.findById(id);
    }

    public List<User> fetchCollection(Map<String, Object> requestArgs) {
        return userDao.fetchCollection(requestArgs);
    }

    public Long fetchCollectionCount(Map<String, Object> requestArgs) {
        return userDao.fetchCollectionCount(requestArgs);
    }

    public Boolean saveOrUpdate(User user) {
        try {
            if (null == user) {
                return false;
            }
            return userDao.saveOrUpdate(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(Map<String,Object> updates){
        return userDao.update(updates);
    }
}

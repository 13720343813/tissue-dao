package com.cn.service.impl;

import com.cn.dao.mysql.UserMapper;
import com.cn.entities.mysql.User;
import com.cn.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User fetchById(Object id) {
        return userMapper.fetchById(id);
    }

    @Override
    public boolean save(User user) {
        try {
            userMapper.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteById(Object id) {
        try {
            userMapper.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> fetchList(Map query) {
        return userMapper.fetchList(query);
    }

    @Override
    public boolean update(User user) {
        try {
            userMapper.update(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean batchSave(List<User> users) {
        try {
            userMapper.batchSave(users);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

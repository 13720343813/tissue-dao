package com.cn.service;

import com.cn.entities.mysql.User;

import java.util.List;

public interface IUserService extends IBaseService<User>{

    public boolean batchSave(List<User> users);
}

package com.cn.dao.mysql;

import com.cn.entities.mysql.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserMapper {

    User fetchById(Object id);

    List<User> fetchList(Map<String, Object> query);

    int save(User user);

    int deleteById(Object id);

    int update(User user);

    int batchSave(List<User> users);

}

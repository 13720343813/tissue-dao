package com.cn.service;

import java.util.List;
import java.util.Map;

public interface IBaseService<T> {
    public T fetchById(Object id);

    public List<T> fetchList(Map<String, Object> query);

    public boolean save(T t);

    public boolean update(Map<String, Object> update);


    public boolean deleteById(Object id);
}

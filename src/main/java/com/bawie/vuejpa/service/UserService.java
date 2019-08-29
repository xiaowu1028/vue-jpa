package com.bawie.vuejpa.service;

import com.bawie.vuejpa.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 列表
     */
    List<User> list();

    /**
     * 删除
     */
    void del(Integer id);

    /**
     * 添加
     */
    void add(User user);

    /**
     * 回显
     */
    User byId(Integer id);

    /**
     * 修改
     */
    void update(User user);


}

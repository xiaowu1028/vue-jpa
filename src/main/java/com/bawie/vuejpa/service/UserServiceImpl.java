package com.bawie.vuejpa.service;

import com.bawie.vuejpa.dao.UserDao;
import com.bawie.vuejpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    /**
     * 列表
     * @return
     */
    @Override
    public List<User> list() {

        return userDao.findAll();
    }

    @Override
    public void del(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public User byId(Integer id) {
        return userDao.findById(id).get();
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }
}

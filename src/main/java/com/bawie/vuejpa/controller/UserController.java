package com.bawie.vuejpa.controller;

import com.bawie.vuejpa.entity.User;
import com.bawie.vuejpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 列表]
     * @return
     */
    @RequestMapping("list")
    public List<User> list(){

        return userService.list();
    }
    /**
     * 删除
     */
    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        userService.del(id);
    }
    /**
     * 增加
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public void add(@RequestBody User user){

        userService.add(user);
    }
    /**
     * 回显
     */
    @RequestMapping("byId/{id}")
    public User byId(@PathVariable Integer id){
        User byId = userService.byId(id);
        return byId;
    }
    /**
     * 修改
     */
    @RequestMapping(value = "update/{id}",method = RequestMethod.PUT)
    public void update(@PathVariable Integer id,@RequestBody User user){
        System.out.println(id);
        user.setId(id);
        userService.update(user);
    }


}

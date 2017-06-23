package com.sqshine.controller;

import com.sqshine.domain.User;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("被调用了");
        for (User user : getUsers()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }


    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        return user;
    }

    // 该请求不会成功
    @GetMapping("/get-user")
    public User getUser(User user) {
        return user;
    }

    @GetMapping("list")
    public List<User> listAll() {
        return getUsers();

    }

    private List<User> getUsers() {
        ArrayList<User> list = new ArrayList<>();
        User user = new User(1L, "zs", "zhangsan", 20, new BigDecimal(10000));
        User user2 = new User(2L, "ls", "lisi", 201, new BigDecimal(20000));
        User user3 = new User(3L, "ww", "wangwu", 210, new BigDecimal(50000));
        list.add(user);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
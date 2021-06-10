package com.andoridrest.Springboot.app.service;

import com.andoridrest.Springboot.app.entity.User;

import java.util.List;

public interface UserService {
    public User createUser(User user);

    public List<User> fetchAllUser();

    public User findUserById(Long userId);
}

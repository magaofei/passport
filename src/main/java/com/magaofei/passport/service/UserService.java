package com.magaofei.passport.service;

import com.magaofei.passport.model.User;

public interface UserService {

    public User findUserByEmail(String email);
    public void saveUser(User user);
}

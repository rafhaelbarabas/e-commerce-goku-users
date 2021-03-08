package com.ecommercegoku.users.services.users;

import com.ecommercegoku.users.models.users.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User update(User user);

    User findById(Long id);

    User findByEmail(String email);

    List<User> findAll();
}

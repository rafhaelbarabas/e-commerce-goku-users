package com.ecommercegoku.users.repositories;

import com.ecommercegoku.users.models.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

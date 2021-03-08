package com.ecommercegoku.users.api;

import com.ecommercegoku.users.models.users.User;
import com.ecommercegoku.users.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        return ResponseEntity
                .ok()
                .body(service.findById(id));
    }

    @GetMapping("search")
    public ResponseEntity findByEmail(@RequestParam String email) {
        return ResponseEntity
                .ok()
                .body(service.findByEmail(email));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody User user) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.save(user));
    }
}

package com.prosoft.minikube.helm.demo.controller;

import com.prosoft.minikube.helm.demo.entity.User;
import com.prosoft.minikube.helm.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        log.info("GET /api/users - Getting all users");
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        log.info("GET /api/users/{} - Getting user by id", id);
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
        log.info("GET /api/users/email/{} - Getting user by email", email);
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(@RequestParam String name) {
        log.info("GET /api/users/search?name={} - Searching users", name);
        return ResponseEntity.ok(userService.searchUsersByName(name));
    }

    @GetMapping("/count")
    public ResponseEntity<Map<String, Long>> getUsersCount() {
        log.info("GET /api/users/count - Getting users count");
        return ResponseEntity.ok(Map.of("count", userService.getUsersCount()));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        log.info("POST /api/users - Creating new user: {}", user.getEmail());
        return ResponseEntity.ok(userService.createUser(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @Valid @RequestBody User user) {
        log.info("PUT /api/users/{} - Updating user", id);
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        log.info("DELETE /api/users/{} - Deleting user", id);
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
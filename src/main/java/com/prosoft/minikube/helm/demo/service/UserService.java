package com.prosoft.minikube.helm.demo.service;

import com.prosoft.minikube.helm.demo.entity.User;
import com.prosoft.minikube.helm.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        log.info("Getting all users");
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        log.info("Getting user by id: {}", id);
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public User getUserByEmail(String email) {
        log.info("Getting user by email: {}", email);
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found with email: " + email));
    }

    public User createUser(User user) {
        log.info("Creating new user: {}", user.getEmail());

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
        }

        return userRepository.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        log.info("Updating user with id: {}", id);

        User user = getUserById(id);

        // Проверяем, что email не занят другим пользователем
        if (!user.getEmail().equals(userDetails.getEmail()) &&
                userRepository.existsByEmail(userDetails.getEmail())) {
            throw new RuntimeException("Email " + userDetails.getEmail() + " is already taken");
        }

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setLatitude(userDetails.getLatitude());
        user.setLongitude(userDetails.getLongitude());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        log.info("Deleting user with id: {}", id);

        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }

        userRepository.deleteById(id);
    }

    public List<User> searchUsersByName(String name) {
        log.info("Searching users by name: {}", name);
        return userRepository.findByNameContainingIgnoreCase(name);
    }

    public long getUsersCount() {
        return userRepository.count();
    }
}
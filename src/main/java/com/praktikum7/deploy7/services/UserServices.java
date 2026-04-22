package com.praktikum7.deploy7.services;

import com.praktikum7.deploy7.model.User;
import com.praktikum7.deploy7.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User request) {
        return userRepository.save(request);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public User updateUser(String id, User request) {
        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {
            existingUser.setName(request.getName());
            existingUser.setNim(request.getNim());
            return userRepository.save(existingUser);
        }

        return null;
    }
}
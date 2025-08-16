package com.demo.demo.serviceimplement;

import com.demo.demo.entities.UserEntity;
import com.demo.demo.repository.UserRepo;
import com.demo.demo.services.UserInterface;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImplement implements UserInterface {
    @Autowired
    UserRepo userRepo;
    private UserEntity user;
    private Long id;

    @Override
    public UserEntity adduser(UserEntity user) {
        return userRepo.save(user);
    }

    @Override
    public void deletedUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<UserEntity> AddListUsers(List<UserEntity> users) {
        return userRepo.saveAll(users);
    }

    @Override
    public String addUserWTCP(UserEntity user) {
        String ch="";
        if(user.getPassword().equals(user.getConfirmPassword())) {
            userRepo.save(user);
            ch="user added successfully";
        }
        else ch=" user password does not match";
        return ch ;
    }

    @Override
    public String addUserWTUN(UserEntity user) {
       String ch = "";
       if(userRepo.existsByUsername((user.getUsername()))) {
           ch="user already exists";
       }else {
           userRepo.save(user);
           ch="user added successfully";
       }
       return ch;
    }

    @Override
    public UserEntity UpdateUser(UserEntity user, Long id) {
        this.user = user;
        this.id = id;
        UserEntity u = userRepo.findById(id).orElse(null);
        u.setFirstname((user.getFirstname()));
        u.setLastname((user.getLastname()));
        return userRepo.save(u);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public UserEntity getUserById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public UserEntity getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<UserEntity> getUserSWT(String un) {
        return userRepo.findbycle(un);
    }

    @Override
    public List<UserEntity> getUserByEmail(String un) {
        return userRepo.findbydomaine(un);
    }
}

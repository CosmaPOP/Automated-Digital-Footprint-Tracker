package com.footprinttracker.Services;

import com.footprinttracker.Entities.Users;

import java.util.List;

public interface UsersService {

    List<Users> getAllUsers();
    Users getUserById(Long id);
    Users createUser(Users user);
    Users updateUser(Long id, Users user);
    void deleteUser(Long id);




}

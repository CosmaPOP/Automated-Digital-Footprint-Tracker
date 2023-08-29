package com.footprinttracker.Repositories;

import com.footprinttracker.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    // Add custom query methods if needed
    Users findByUsername(String username);
}
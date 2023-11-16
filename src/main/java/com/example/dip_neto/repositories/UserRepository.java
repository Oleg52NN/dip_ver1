package com.example.dip_neto.repositories;

import com.example.dip_neto.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
    public interface UserRepository extends JpaRepository<Users, Long> {
        Optional<Users> findByEmail(String email);

        Optional<Users> findByUsername(String username);
    }

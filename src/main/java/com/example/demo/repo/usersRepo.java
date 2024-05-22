package com.example.demo.repo;

import com.example.demo.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface usersRepo extends JpaRepository<users, UUID> {
}

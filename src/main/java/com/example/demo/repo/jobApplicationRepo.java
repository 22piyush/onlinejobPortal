package com.example.demo.repo;

import com.example.demo.entity.jobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface jobApplicationRepo extends JpaRepository<jobApplication, UUID> {
}

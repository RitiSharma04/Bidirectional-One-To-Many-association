package com.example.repository;

import com.example.entity.Blog;
import com.example.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
    List<Owner> findByCategory(String category);
}
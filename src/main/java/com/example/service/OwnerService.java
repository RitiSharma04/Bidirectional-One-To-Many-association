package com.example.service;

import com.example.entity.Blog;
import com.example.entity.Owner;

import java.util.List;

public interface OwnerService {
   Owner saveOwner(Owner owner);

    Owner getOwnerById(int id);

    List<Owner> getAllOwner();

    List<Owner> getOwnerByCategory(String category);

    void deleteOwner(int id);
}

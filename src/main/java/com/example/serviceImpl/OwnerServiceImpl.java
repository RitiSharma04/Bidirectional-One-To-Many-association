package com.example.serviceImpl;

import com.example.entity.Owner;
import com.example.repository.OwnerRepository;
import com.example.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerRepository ownerRepository;
    @Override
    public Owner saveOwner(Owner owner){
        return ownerRepository.save(owner);
    }

    @Override
    public Owner getOwnerById(int id) {
        return ownerRepository.findById(id).get();
    }

    @Override
    public List<Owner> getAllOwner() {
        return ownerRepository.findAll();
    }

    @Override
    public List<Owner> getOwnerByCategory(String category) {
        return ownerRepository.findByCategory(category);
    }

    @Override
    public void deleteOwner(int id) {
         ownerRepository.deleteById(id);
    }
}

package com.shoppingmall.shopowner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ShopOwnerService {

    @Autowired
    private ShopOwnerRepository repo;

   
    public List<ShopOwner> listAll() {
        return repo.findAll();
    }

    
    public void save(ShopOwner shopOwner) {
        repo.save(shopOwner);
    }

    
    public ShopOwner get(Integer id) {
        return repo.findById(id).orElseThrow(() -> 
            new NoSuchElementException("Shop Owner not found with ID: " + id));
    }

    
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
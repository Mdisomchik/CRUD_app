package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> listAll() {
        return repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }

    public Product get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    public List<Product> filterProducts(String brand, String color, String fuelType) {
        return repo.findByBrandContainingIgnoreCaseAndColorContainingIgnoreCaseAndFuelTypeContainingIgnoreCase(brand, color, fuelType);
    }

}
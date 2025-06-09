package com.example.ecommerce.backend.application;

import com.example.ecommerce.backend.domain.model.Product;
import com.example.ecommerce.backend.domain.port.IProductRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductService {
    private final IProductRepository iProductRepository;

    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    public Product save(Product product){
        return this.iProductRepository.save(product);
    }

    public Iterable<Product> findAll(){
        return this.iProductRepository.findAll();
    }

    public Product findById(Integer id){
        return this.iProductRepository.findById(id);
    }
    public void deleteById(Integer id){
        this.iProductRepository.deleteById(id);
    }
}


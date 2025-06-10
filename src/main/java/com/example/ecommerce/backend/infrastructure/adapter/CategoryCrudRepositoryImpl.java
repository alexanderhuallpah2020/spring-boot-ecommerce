package com.example.ecommerce.backend.infrastructure.adapter;

import com.example.ecommerce.backend.domain.model.Category;
import com.example.ecommerce.backend.domain.port.ICategoryRepository;

public class CategoryCrudRepositoryImpl implements ICategoryRepository {

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Iterable<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

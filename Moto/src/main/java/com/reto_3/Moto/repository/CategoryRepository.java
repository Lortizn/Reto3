package com.reto_3.Moto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto_3.Moto.model.Category;
import com.reto_3.Moto.repository.crud.CategoryCrudRepositoryInterfaz;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepositoryInterfaz categoryCrudRepositoryInterfaz;

    public List<Category> obtenerCategoryCompleta(){
        return (List<Category>) categoryCrudRepositoryInterfaz.findAll();
    }

    public Optional<Category> obtenerCategoryId(Integer id){
        return categoryCrudRepositoryInterfaz.findById(id);
    }

    public Category salvarCategory(Category category){
        return categoryCrudRepositoryInterfaz.save(category);     
    }
}

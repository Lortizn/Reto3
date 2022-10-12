package com.reto_3.Moto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto_3.Moto.model.Category;
import com.reto_3.Moto.repository.CategoryRepository;

@Service
public class CategoryService  {
    @Autowired
    public CategoryRepository categoryRepository;

    public List<Category> obtenerCategoryCompleta(){
        return categoryRepository.obtenerCategoryCompleta();

    }

    public Optional<Category> obtenerCategoryId(Integer id){
        return categoryRepository.obtenerCategoryId(id);
    }
public Category salvarCategory(Category category){
        if(category.getId()==null){
            return categoryRepository.salvarCategory(category);
        }
        else{
            Optional <Category> categoryAuxiliar = categoryRepository.obtenerCategoryId(category.getId());
            if(categoryAuxiliar.isEmpty()){
                return categoryRepository.salvarCategory(category);
            }
            else{
                return category;
            }
        }

    }
}

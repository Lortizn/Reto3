package com.reto_3.Moto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.reto_3.Moto.model.Category;
import com.reto_3.Moto.service.CategoryService;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> obtenerCategoryCompleta() {
        return categoryService.obtenerCategoryCompleta();
    }

    @GetMapping("/{id}")
    public Optional<Category> obtenerCategoryId(@PathVariable("id") Integer identificador) {
        return categoryService.obtenerCategoryId(identificador);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category salvarCategory(@RequestBody Category category) {
        return categoryService.salvarCategory(category);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean BorrarControllerCategory(@PathVariable("id")int id){
        return categoryService.BorrarCategory(id);
    }



}

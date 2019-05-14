package com.mhusein.api.controller 

import java.util.List
import com.mhusein.api.entity.Category
import com.mhusein.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired
import javax.validation.Valid

@RestController

@RequestMapping('/categories')

class CategoryController {    
 @Autowired    
 private final CategoryService categoryService

 @GetMapping('')    
    List<Category> findAll() {        
    return categoryService.findAll()   
 }

  @PostMapping('/categories')
  Category newCategory(@RequestBody Category newCategory) {
    return categoryService.save(newCategory);
  }

  @PutMapping("/categories/{id}")
  Category replaceCategory(@RequestBody Category newCategory, @PathVariable Integer id) {
    return CategoryService.findById(id)
        CategoryService.setName(newCategory.getName());
        return CategoryService.save(category);
  }

  @DeleteMapping("/categories/{id}")
  void deleteCategory(@PathVariable Integer id) {
    categoryService.deleteById(id);
  }

}
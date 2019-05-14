package com.mhusein.api.service.implement
import com.mhusein.api.entity.Category 
import com.mhusein.api.repository.CategoryRepository 
import com.mhusein.api.service.CategoryService 
import org.springframework.beans.factory.annotation.Autowired 
import org.springframework.stereotype.Service

@Service 
class CategoryServiceimplement implements CategoryService {
 @Autowired    
 private final CategoryRepository CategoryRepository     
 @Override    
 List<Category>findAll() { 
 CategoryRepository.findAll()           
 }
 @Override    
  Category findById(int id) { 
  CategoryRepository.findById(id)
   }
 }
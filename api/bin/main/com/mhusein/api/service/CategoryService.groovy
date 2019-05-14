package com.mhusein.api.service
import com.mhusein.api.entity.Category

interface CategoryService { 
    List<Category>findAll()   
    Category findById(int id)
     }
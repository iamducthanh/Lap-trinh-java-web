package com.laptrinhjavaweb.services.impl;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.dao.impl.CategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.services.ICatergoryService;

import java.util.List;

public class CategoryService implements ICatergoryService {
    private ICategoryDAO categoryDAO;

    public CategoryService(){
        categoryDAO = new CategoryDAO();
    }
    @Override
    public List<CategoryModel> findAll() {
        return categoryDAO.findAll();
    }
}

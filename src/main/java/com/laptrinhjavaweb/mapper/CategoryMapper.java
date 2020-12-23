package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.model.CategoryModel;

import java.sql.ResultSet;

public class CategoryMapper implements RowMapper<CategoryModel> {
    @Override
    public CategoryModel mapRow(ResultSet resultSet) {
        CategoryModel categoryModel = new CategoryModel();
        try {
            categoryModel.setCode(resultSet.getString("code"));
            categoryModel.setName(resultSet.getString("name"));
            categoryModel.setId(resultSet.getLong("id"));
            return categoryModel;
        } catch (Exception e){
            return null;
        }
    }
}

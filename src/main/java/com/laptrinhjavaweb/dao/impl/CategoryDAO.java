package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.model.CategoryModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

    @Override
    public List<CategoryModel> findAll() {
        String sql = "select * from category";
        return query(sql, new CategoryMapper());
    }
}

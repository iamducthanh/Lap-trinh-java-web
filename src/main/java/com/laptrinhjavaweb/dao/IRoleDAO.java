package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.RoleModel;

import java.util.List;

public interface IRoleDAO extends GenericDAO<RoleModel>{
    List<RoleModel> findAll();
}

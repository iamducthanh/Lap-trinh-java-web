package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IRoleDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.model.RoleModel;

import java.util.List;

public class RoleDAO extends AbstractDAO<RoleModel> implements IRoleDAO {
    @Override
    public List<RoleModel> findAll() {
        return null;
    }
}

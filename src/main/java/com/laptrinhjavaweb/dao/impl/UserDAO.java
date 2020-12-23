package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.model.UserModel;

import java.util.List;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

    @Override
    public List<UserModel> findAll() {
        return null;
    }
}

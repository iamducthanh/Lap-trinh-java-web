package com.laptrinhjavaweb.dao;
import com.laptrinhjavaweb.model.UserModel;

import java.util.List;

public interface IUserDAO extends GenericDAO<UserModel> {
    List<UserModel> findAll();
}

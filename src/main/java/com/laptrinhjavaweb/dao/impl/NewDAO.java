package com.laptrinhjavaweb.dao.impl;


import com.laptrinhjavaweb.dao.INewDao;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.newModel;

import java.util.List;

public class NewDAO extends AbstractDAO<newModel> implements INewDao {

    @Override
    public List<newModel> findByCatoryId(long id) {
        String sql = "SELECT * FROM news WHERE categoryid = ?";
        return query(sql, new NewMapper(), id);
    }
}
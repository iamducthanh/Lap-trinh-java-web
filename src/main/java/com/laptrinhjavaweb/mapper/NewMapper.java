package com.laptrinhjavaweb.mapper;

import com.laptrinhjavaweb.model.newModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewMapper implements RowMapper<newModel>{
    @Override
    public newModel mapRow(ResultSet resultSet) {
        try {
            newModel news = new newModel();
            news.setId(resultSet.getLong("1"));
            news.setTitle(resultSet.getString("tittle"));
            return news;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

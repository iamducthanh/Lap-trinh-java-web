package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.GenericDAO;
import com.laptrinhjavaweb.mapper.RowMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AbstractDAO<T> implements GenericDAO<T> {
    private Object PreparedStatement;

    public static Connection connect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=WEBTINTUC;","sa","123");
            return conn;
        } catch (Exception e){
            return null;
        }
    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
        try {
            List<T> result = new ArrayList<>();
            Connection conn = connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            setParameter(ps, parameters);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                result.add(rowMapper.mapRow(resultSet));
            }
            conn.close();
            parameters.clone();
            ps.close();
            return result;
        } catch (Exception e){
            return null;
        }
    }

    private void setParameter(PreparedStatement ps, Object... parameters){
        try {
            for (int i=0; i< parameters.length;i++){
                Object parameter = parameters[i];
                int index = i + 1;
                if(parameter instanceof Long){
                    ps.setLong(index, (Long) parameter);
                } else {
                    ps.setString(index, (String) parameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

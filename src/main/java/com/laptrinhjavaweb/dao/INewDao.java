package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.model.newModel;

import java.util.List;

public interface INewDao extends GenericDAO<newModel>{
    List<newModel> findByCatoryId(long id);
}

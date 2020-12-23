package com.laptrinhjavaweb.services.impl;

import com.laptrinhjavaweb.dao.INewDao;
import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.services.INewService;

import java.util.List;

public class NewService implements INewService {
    private INewDao newDao;

//    public NewService(){
//        newDao = new NewDao();
//    }

    @Override
    public List<newModel> findByCatoryId(long id) {
        return newDao.findByCatoryId(id);
    }
}

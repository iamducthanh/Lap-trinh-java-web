package com.laptrinhjavaweb.services;


import com.laptrinhjavaweb.model.newModel;

import java.util.List;

public interface INewService {
    List<newModel> findByCatoryId(long id);
}

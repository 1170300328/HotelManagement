package com.neusoft.ho.service;

import java.util.List;

import com.neusoft.ho.model.CheckinModel;



public interface CheckinService {
	public int add(CheckinModel rm) throws Exception;

	public void modify(CheckinModel rm) throws Exception;

	public void delete(CheckinModel rm) throws Exception;

	public List<CheckinModel> getListByAll() throws Exception;

}

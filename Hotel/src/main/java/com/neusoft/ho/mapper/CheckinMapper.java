package com.neusoft.ho.mapper;

import java.util.List;

import com.neusoft.ho.model.CheckinModel;

public interface CheckinMapper {
	public void insert(CheckinModel rm) throws Exception;

	public void update(CheckinModel rm) throws Exception;

	public void delete(CheckinModel rm) throws Exception;

	public List<CheckinModel> selectByAll() throws Exception;
}

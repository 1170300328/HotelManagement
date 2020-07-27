package com.neusoft.ho.mapper;

import java.util.List;

import com.neusoft.ho.model.CheckinModel;
import com.neusoft.ho.model.CheckoutModel;

public interface CheckoutMapper {
	public void insert(CheckoutModel rm) throws Exception;

	public void update(CheckoutModel rm) throws Exception;

	public void delete(CheckoutModel rm) throws Exception;

	public List<CheckoutModel> selectByAll() throws Exception;
}

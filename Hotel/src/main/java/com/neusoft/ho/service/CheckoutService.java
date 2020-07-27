package com.neusoft.ho.service;

import java.util.List;


import com.neusoft.ho.model.CheckoutModel;



public interface CheckoutService {
	public int add(CheckoutModel rm) throws Exception;

	public void modify(CheckoutModel rm) throws Exception;

	public void delete(CheckoutModel rm) throws Exception;

	public List<CheckoutModel> getListByAll() throws Exception;

}

package com.neusoft.ho.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ho.model.CheckinModel;
import com.neusoft.ho.model.CheckoutModel;
import com.neusoft.ho.service.CheckinService;
import com.neusoft.ho.service.CheckoutService;
import com.neusoft.ho.mapper.*;

@Service
@Transactional  //环绕事务Advice的切入点
public class CheckoutServiceImpl implements CheckoutService{
	@Autowired
	private CheckoutMapper CheckoutMapper=null;
	@Override
	public int add(CheckoutModel cm) throws Exception {
		CheckoutMapper.insert(cm);
		return 0;
	}

	@Override
	public void modify(CheckoutModel cm) throws Exception {
		CheckoutMapper.update(cm);
		
	}

	@Override
	public void delete(CheckoutModel cm) throws Exception {
		CheckoutMapper.delete(cm);
		
	}

	@Override
	public List<CheckoutModel> getListByAll() throws Exception {
		return CheckoutMapper.selectByAll();
	}

}

package com.neusoft.ho.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ho.model.CheckinModel;
import com.neusoft.ho.service.CheckinService;
import com.neusoft.ho.mapper.*;

@Service
@Transactional  //环绕事务Advice的切入点
public class CheckinServiceImpl implements CheckinService{
	@Autowired
	private CheckinMapper CheckinMapper=null;
	@Override
	public int add(CheckinModel cm) throws Exception {
		CheckinMapper.insert(cm);
		return 0;
	}

	@Override
	public void modify(CheckinModel cm) throws Exception {
		CheckinMapper.update(cm);
		
	}

	@Override
	public void delete(CheckinModel cm) throws Exception {
		CheckinMapper.delete(cm);
		
	}

	@Override
	public List<CheckinModel> getListByAll() throws Exception {
		return CheckinMapper.selectByAll();
	}

}

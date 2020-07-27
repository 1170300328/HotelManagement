package com.neusoft.ho.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.mapper.*;

@Service
@Transactional  //环绕事务Advice的切入点
public class RoomServiceImpl implements RoomService{
	@Autowired
	private RoomMapper RoomMapper=null;
	@Override
	public int add(RoomModel rm) throws Exception {
		RoomMapper.insert(rm);
		return 0;
	}

	@Override
	public void modify(RoomModel rm) throws Exception {
		RoomMapper.update(rm);
		
	}

	@Override
	public void delete(RoomModel rm) throws Exception {
		RoomMapper.delete(rm);
		
	}

	@Override
	public List<RoomModel> getListByAll() throws Exception {
		RoomMapper.selectByAll();
		return null;
	}

}

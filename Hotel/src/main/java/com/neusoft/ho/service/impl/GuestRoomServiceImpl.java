package com.neusoft.ho.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ho.model.GuestRoomModel;
import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.service.GuestRoomService;
import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.mapper.*;

@Service
@Transactional  //环绕事务Advice的切入点
public class GuestRoomServiceImpl implements GuestRoomService{
	@Autowired
	private GuestRoomMapper GuestRoomMapper=null;
	@Override
	public int add(GuestRoomModel gm) throws Exception {
		
		GuestRoomMapper.insert(gm);
		return 0;
	}

	@Override
	public void modify(GuestRoomModel gm) throws Exception {
		GuestRoomMapper.update(gm);
		
	}

	@Override
	public void delete(GuestRoomModel gm) throws Exception {
		GuestRoomMapper.update(gm);
		
	}

	@Override
	public List<GuestRoomModel> getListByAll() throws Exception {
		return GuestRoomMapper.selectByAll();
	}
	//获得空闲房间
	@Override
	public List<GuestRoomModel> getFree() throws Exception {

		return GuestRoomMapper.selectFree();
	}

	@Override
	public void changeState(int id, String state) throws Exception {
		GuestRoomMapper.changeState(id, state);
		
	}

}

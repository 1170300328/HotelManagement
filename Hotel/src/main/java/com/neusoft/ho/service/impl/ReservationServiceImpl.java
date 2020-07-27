package com.neusoft.ho.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ho.model.ReservationModel;
import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.service.ReservationService;
import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.mapper.*;

@Service
@Transactional  //环绕事务Advice的切入点
public class ReservationServiceImpl implements ReservationService{
	@Autowired
	private ReservationMapper ReservationMapper=null;
	@Override
	public int add(ReservationModel rm) throws Exception {
		ReservationMapper.insert(rm);
		return 0;
	}

	@Override
	public void modify(ReservationModel rm) throws Exception {
		ReservationMapper.update(rm);
		
	}

	@Override
	public void delete(ReservationModel rm) throws Exception {
		ReservationMapper.delete(rm);
		
	}

	@Override
	public List<ReservationModel> getListByAll() throws Exception {
		return ReservationMapper.selectByAll();
	}

}

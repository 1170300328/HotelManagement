package com.neusoft.ho.service;

import java.util.List;

import com.neusoft.ho.model.RoomModel;



public interface RoomService {
	public int add(RoomModel rm) throws Exception;

	public void modify(RoomModel rm) throws Exception;

	public void delete(RoomModel rm) throws Exception;

	public List<RoomModel> getListByAll() throws Exception;

}

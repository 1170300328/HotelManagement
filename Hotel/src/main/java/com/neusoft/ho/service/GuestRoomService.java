package com.neusoft.ho.service;

import java.util.List;

import com.neusoft.ho.model.GuestRoomModel;
import com.neusoft.ho.model.RoomModel;



public interface GuestRoomService {
	public int add(GuestRoomModel rm) throws Exception;

	public void modify(GuestRoomModel rm) throws Exception;

	public void delete(GuestRoomModel rm) throws Exception;

	public List<GuestRoomModel> getListByAll() throws Exception;
	//获得空闲房间
	public List<GuestRoomModel> getFree() throws Exception;
	
	public void changeState(int id,String state) throws Exception;
	
}

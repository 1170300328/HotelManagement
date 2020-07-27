package com.neusoft.ho.mapper;

import java.util.List;

import com.neusoft.ho.model.GuestRoomModel;
import com.neusoft.ho.model.RoomModel;

public interface GuestRoomMapper {
	public void insert(GuestRoomModel rm) throws Exception;

	public void update(GuestRoomModel rm) throws Exception;

	public void delete(GuestRoomModel rm) throws Exception;

	public List<GuestRoomModel> selectByAll() throws Exception;
	//获得空闲房间
	public List<GuestRoomModel> selectFree() throws Exception;
	//改变客房状态
	public void changeState(int id,String state) throws Exception;
}

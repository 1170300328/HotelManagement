package com.neusoft.ho.mapper;

import java.util.List;

import com.neusoft.ho.model.RoomModel;

public interface RoomMapper {
	public void insert(RoomModel rm) throws Exception;
	//修改房间
	public void update(RoomModel rm) throws Exception;
	//删除房间
	public void delete(RoomModel rm) throws Exception;
	//取得所有房间
	public List<RoomModel> selectByAll() throws Exception;
}

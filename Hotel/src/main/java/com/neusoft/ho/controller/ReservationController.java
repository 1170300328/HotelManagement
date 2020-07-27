package com.neusoft.ho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ho.service.GuestRoomService;
import com.neusoft.ho.service.ReservationService;
import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.model.GuestRoomModel;
import com.neusoft.ho.model.ReservationModel;
import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.restresult.*;


@RestController
@RequestMapping(value="/reservation")
public class ReservationController {
	@Autowired
	private ReservationService rs=null;
	
	@Autowired
	private GuestRoomService gs=null;
	@PostMapping(value="/add")
	public Result<String> add(ReservationModel rm) throws Exception{
		rs.add(rm);
		//将对应的房间状态设置为预约
		gs.changeState(rm.getRid(), "预约");
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加预约表成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(ReservationModel rm) throws Exception{
		rs.modify(rm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改预约表成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(ReservationModel rm) throws Exception{
		rs.delete(rm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除预约表成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<ReservationModel> getByAll() throws Exception{
		Result<ReservationModel> result=new Result<ReservationModel>();
		result.setList(rs.getListByAll());
		
		result.setStatus("OK");
		result.setMessage("取得预约表成功!");
		return result;
	}

}

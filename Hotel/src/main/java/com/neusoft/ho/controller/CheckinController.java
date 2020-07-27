package com.neusoft.ho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ho.service.CheckinService;
import com.neusoft.ho.service.GuestRoomService;
import com.neusoft.ho.service.ReservationService;
import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.model.CheckinModel;
import com.neusoft.ho.model.GuestRoomModel;
import com.neusoft.ho.model.ReservationModel;
import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.restresult.*;


@RestController
@RequestMapping(value="/checkin")
public class CheckinController {
	@Autowired
	private CheckinService cs=null;
	
	@Autowired
	private GuestRoomService gs=null;
	@PostMapping(value="/add")
	public Result<String> add(CheckinModel cm) throws Exception{
		cs.add(cm);
		//将对应的房间状态设置为入住
		gs.changeState(cm.getRid(), "入住");
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加入住表成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(CheckinModel cm) throws Exception{
		cs.modify(cm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改入住表成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(CheckinModel cm) throws Exception{
		cs.delete(cm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除入住表成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<CheckinModel> getByAll() throws Exception{
		Result<CheckinModel> result=new Result<CheckinModel>();
		result.setList(cs.getListByAll());
		
		result.setStatus("OK");
		result.setMessage("取得入住表成功!");
		return result;
	}

}

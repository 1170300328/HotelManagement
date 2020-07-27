package com.neusoft.ho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ho.service.GuestRoomService;
import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.model.GuestRoomModel;
import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.restresult.*;


@RestController
@RequestMapping(value="/guestroom")
public class GuestRoomController {
	@Autowired
	private GuestRoomService gs=null;
	
	@PostMapping(value="/add")
	public Result<String> add(GuestRoomModel gm) throws Exception{
		gs.add(gm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加房间成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(GuestRoomModel gm) throws Exception{
		gs.modify(gm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改房间成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(GuestRoomModel gm) throws Exception{
		gs.delete(gm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除房间成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<GuestRoomModel> getByAll() throws Exception{
		Result<GuestRoomModel> result=new Result<GuestRoomModel>();
		result.setList(gs.getListByAll());
		
		result.setStatus("OK");
		result.setMessage("取得房间成功!");
		return result;
	}
	@GetMapping(value="/getfree")
	public Result<GuestRoomModel> getFree() throws Exception{
		Result<GuestRoomModel> result=new Result<GuestRoomModel>();
		result.setList(gs.getFree());		
		result.setStatus("OK");
		result.setMessage("取得空闲房间成功!");
		return result;
	}
	@PostMapping(value="/changestate")
	public Result<String> changeState(@RequestParam(required=true)int id, @RequestParam(required=true)String state) throws Exception{
		gs.changeState(id, state);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改状态成功!");
		return result;
	}
}

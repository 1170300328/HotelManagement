package com.neusoft.ho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.restresult.*;


@RestController
@RequestMapping(value="/room")
public class RoomController {
	@Autowired
	private RoomService rs=null;
	
	@PostMapping(value="/add")
	public Result<String> add(RoomModel rm) throws Exception{
		rs.add(rm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加部门成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(RoomModel rm) throws Exception{
		rs.modify(rm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改房间成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(RoomModel rm) throws Exception{
		rs.delete(rm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除房间成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<RoomModel> getByAll() throws Exception{
		Result<RoomModel> result=new Result<RoomModel>();
		result.setList(rs.getListByAll());
		
		result.setStatus("OK");
		result.setMessage("取得房间成功!");
		return result;
	}
}

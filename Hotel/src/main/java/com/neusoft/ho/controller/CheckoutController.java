package com.neusoft.ho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ho.service.CheckinService;
import com.neusoft.ho.service.CheckoutService;
import com.neusoft.ho.service.GuestRoomService;
import com.neusoft.ho.service.ReservationService;
import com.neusoft.ho.service.RoomService;
import com.neusoft.ho.model.CheckinModel;
import com.neusoft.ho.model.CheckoutModel;
import com.neusoft.ho.model.GuestRoomModel;
import com.neusoft.ho.model.ReservationModel;
import com.neusoft.ho.model.RoomModel;
import com.neusoft.ho.restresult.*;


@RestController
@RequestMapping(value="/checkout")
public class CheckoutController {
	@Autowired
	private CheckoutService cs=null;
	
	@Autowired
	private GuestRoomService gs=null;
	@PostMapping(value="/add")
	public Result<String> add(CheckoutModel cm) throws Exception{
		cs.add(cm);
		//将对应的房间状态设置为空房
		gs.changeState(cm.getRid(), "空房");
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加退房表成功!");
		return result;
	}
	@PostMapping(value="/modify")
	public Result<String> modify(CheckoutModel cm) throws Exception{
		cs.modify(cm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改退房表成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(CheckoutModel cm) throws Exception{
		cs.delete(cm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除退房表成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<CheckoutModel> getByAll() throws Exception{
		Result<CheckoutModel> result=new Result<CheckoutModel>();
		result.setList(cs.getListByAll());
		
		result.setStatus("OK");
		result.setMessage("取得退房表成功!");
		return result;
	}

}

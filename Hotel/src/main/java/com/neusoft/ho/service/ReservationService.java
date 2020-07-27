package com.neusoft.ho.service;

import java.util.List;

import com.neusoft.ho.model.ReservationModel;



public interface ReservationService {
	public int add(ReservationModel rm) throws Exception;

	public void modify(ReservationModel rm) throws Exception;

	public void delete(ReservationModel rm) throws Exception;

	public List<ReservationModel> getListByAll() throws Exception;

}

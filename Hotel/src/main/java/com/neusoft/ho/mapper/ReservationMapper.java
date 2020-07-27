package com.neusoft.ho.mapper;

import java.util.List;

import com.neusoft.ho.model.ReservationModel;

public interface ReservationMapper {
	public void insert(ReservationModel rm) throws Exception;

	public void update(ReservationModel rm) throws Exception;

	public void delete(ReservationModel rm) throws Exception;

	public List<ReservationModel> selectByAll() throws Exception;
}

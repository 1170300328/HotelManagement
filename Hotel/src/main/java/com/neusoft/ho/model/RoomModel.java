package com.neusoft.ho.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("Room")
public class RoomModel implements Serializable{
	private String type = null;
	private int maxperson = 0;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMaxperson() {
		return maxperson;
	}
	public void setMaxperson(int maxperson) {
		this.maxperson = maxperson;
	}
}

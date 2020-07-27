package com.neusoft.ho.model;
import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("GuestRoom")
public class GuestRoomModel implements Serializable{
	private int id;
	private String type;
	private String state;
	private String floor;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

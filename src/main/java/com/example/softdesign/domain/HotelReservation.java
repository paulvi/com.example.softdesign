package com.example.softdesign.domain;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HotelReservation {
	
	Date created;
	Hotel hotel;
	Date arriving;
	Date leaving;
	
	public HotelReservation(){
		created = new Date();
	}
	
	public void calcTotal() {
		
		long diff = leaving.getTime() - arriving.getTime();
		long days = TimeUnit.DAYS.convert(diff , TimeUnit.MILLISECONDS);
	}

	
	// --- getters & setters
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Date getArriving() {
		return arriving;
	}
	public void setArriving(Date arriving) {
		this.arriving = arriving;
	}
	public Date getLeaving() {
		return leaving;
	}
	public void setLeaving(Date leaving) {
		this.leaving = leaving;
	}


}

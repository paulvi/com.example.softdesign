package com.example.softdesign;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.softdesign.domain.Hotel;
import com.example.softdesign.domain.HotelReservation;

public class App {

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws ParseException {
		Hotel hotel = new Hotel("5 star");
		hotel.setDayRate(500);
		
		HotelReservation reservation = new HotelReservation();
		reservation.setHotel(hotel);
		reservation.setArriving(dateFormat.parse("2016-5-28"));
		reservation.setLeaving(dateFormat.parse("2016-5-30"));
		reservation.getTotal();
		
		

	}

}

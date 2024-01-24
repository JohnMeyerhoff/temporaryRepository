package org.hbrs.se1.ws23.uebung10.refactoring;

public class Booking {
	
	private String hotel;
	
	private int number;
	
	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	private String duration;
	
	private boolean isCancelled;

	public boolean isCancelled() {
		return this.isCancelled;
	}
	
	public void setCancelled( boolean isC ){
		this.isCancelled = isC;
	}
	
	

}

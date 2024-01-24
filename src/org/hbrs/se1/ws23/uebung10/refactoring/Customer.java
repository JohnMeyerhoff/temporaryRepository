package org.hbrs.se1.ws23.uebung10.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	public int numberOfBookings = 0;
	
	public int numberOfCancellations = 0;
	
	private String n;
	
	private String date;
	
	public String lastreturn;
	
	private Vector<Booking> books = new Vector();
	
	public void getBookingsAndCancellations(){
		int i = 0;
		int j = 0;
		Enumeration<Booking> element = books.elements();
		while (element.hasMoreElements()){
			Booking xxx = element.nextElement();
			i++;
			if ( xxx.isCancelled() ){
				j++; 
			}
		}
		this.numberOfBookings = i;
		this.numberOfCancellations = j;
		String result = "Report für den Kunden: " + this.n + ": \n";
		result += "Sie haben " + i + " Buchungen und " + j + " Stornierungen";
		result += "Sie sind übrigens seit dem " + date + " Mitglied bei booking.com";
		this.setLastReturn( result );
	}

	private void setLastReturn(String result) {
		this.lastreturn = result;
		
	}

}

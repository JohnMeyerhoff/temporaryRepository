package org.hbrs.se1.ws23.uebung10;

public class BookingService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookingService service = new BookingService();
		service.start();
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	
	public void getInfoAboutCustomer( Customer c ){
		c.getBookingsAndCancellations();
		
		if (c.numberOfCancellations > 30 ) {
			System.out.println("Problematischer Kunde da zu viele Stornierungen!");
			c.numberOfCancellations = 0;
			System.out.println("... nun nicht mehr");
		}
		
	}

}

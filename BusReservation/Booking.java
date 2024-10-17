package BusReservation;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {

	String passengerName;
	int busNo;
	Date date;

	Booking() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name of Pasanger: ");
		passengerName = scan.next();

		System.out.println("Enter bus No: ");
		busNo = scan.nextInt();

		System.out.println("Enter date DD-MM-YYYY");
		String dataInput = scan.next();
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormate.parse(dataInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		
		// Find the bus capacity
		for(Bus bus:buses) {
			if(bus.getBusno() == busNo)
				capacity = bus.getCapacity();
		}
		
		int booked = 0;
		// Format both dates as 'dd-MM-yyyy' strings and compare them
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		for(Booking b:bookings) { 
			if(b.busNo == busNo && dateFormat.format(b.date).equals(dateFormat.format(this.date))) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}

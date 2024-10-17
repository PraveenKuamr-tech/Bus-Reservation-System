# Bus-Reservation-System
This Bus Reservation System is a Java-based project designed to allow passengers to book seats on available buses for a specific date.The system checks for seat availability based on the bus capacity and booked seats. It provides users with a simple console interface to enter passenger details, bus number, and the travel date.

Features :

* Bus Information: Displays details of available buses, including bus number, A/C status, and total capacity.
* Seat Booking: Allows passengers to book seats by providing their name, the bus number, and the date of travel.
* Availability Check: Ensures that seat bookings do not exceed the bus capacity for the selected date.
* Real-Time Booking Feedback: Notifies users whether the booking is confirmed or if the bus is full, prompting them to choose another bus or date.

Project Structure
* Booking.java: Handles passenger information, booking details, and checks availability.
* Bus.java: Represents the bus object with details like bus number, air-conditioning (AC) status, and seating capacity.
* Main.java: The main entry point for the system, where buses are initialized, and the user interaction occurs.

Technology Stack
* Language: Java

  Libraries
    * java.util.Scanner for user input.
    * java.util.ArrayList to store buses and bookings.
    * java.text.SimpleDateFormat and java.util.Date for handling date inputs and comparisons.

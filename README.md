###### BUS RESERVATION SYSTEM - BOOKBUS 🚌🚌🚌

A Java-based prototype for booking bus reservations efficiently.

## Overview

This application allows users to book, manage bus tickets. Designed as a prototype, it offers a glimpse into a practical bus reservation system.

## Working

# Assumption

There are totally 3 buses with associated drivers and associated routes.
There are only starting departure and destination, no in between stops.
All the 3 buses follows a certain timing regularly for each and every day in a month.

Passengers can reserve a seat but **no** particular seat as like the modern apps does.
Passengers can only pay hand cash.
Passengers can snip the ticket for reference right after successful booking.

This application prompts user for selecting the route bus.

After selection of buses:
Books the bus ticket on the date asked by the passengers if seats are available.
If seats are not available for the user on the specific date, the app handles the situation.

## Features

- User-friendly console interface.
- Real-time seat availability updates.
- Easy ticket booking.
- View on the available buses with route details.
- Ticket generation with covering necessary details.

## Concepts covered

- Packages
- Object-Oriented Programming
  - Classes & Objects
  - Interface
  - Abstraction
  - Inheritance
- Exception Handling
- Collection Frameworks

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE like Eclipse, IntelliJ, or VS Code

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yaswanthkumaranbu/Bus_Reservation_System.git
   ```

2. Run the generated Main class file:

   **VS CODE**
   javac -d bin src\com\bookbus\busreserve\Main.java

   java -cp bin com.bookbus.busreserve.Main

   **ECLIPSE**
   run Main.java file

## Usage

1. Run the `Main.java` file.
2. Follow the on-screen instructions to:
   - View available buses.
   - Book ticket.
   - Exit.

## Project Structure

├── bin # Compiled bytecode files (.class)
│ ├── com.bookbus.busreserve
│ │ ├── Main.class
│ │ ├── model
│ │ ├── services
│ │ ├── utilities
├── src # Source code (.java)
│ ├── com.bookbus.busreserve
│ │ ├── Main.java # Entry point
│ │ ├── model # Data models (Bus, Passengers, BookedDetails, BusDrivers.)
│ │ ├── services # Service layer for logic (Booking, Ticket.)
│ │ ├── utilities # Helper classes and utilities
├── README.md

## Files and Functionality

**src\com\bookbus\busreserve\Main.java**

- Initialization of the bus details and bus driver details
- Book a seat on an available bus.
- View available buses.
- Exit the system.

**src\com\bookbus\busreserve\iservices**

> IBusReservationServices.java

- All the abstract methods are declared within this interface (Checks seat availability, Displays bus info)

> IBusTicket.java

- All the abstract methods are to be declared (created for future development)

**src\com\bookbus\busreserve\model**

> BookedDetails.java

- Setter method for returning the all entries of ticket booked.

> Bus.java

- Getter/Setter methods for Bus details

> BusDrivers.java

- Getter/Setter methods for Bus Driver details

> Passengers.java

- Getter/Setter methods for Passengers details

**src\com\bookbus\busreserve\services**

> Booking.java

- Implementation of methods that are available inside IBusReservationServices

> Ticket.java

- Displays Passenger ticket right after successful booking📃

**src\com\bookbus\busreserve\utilities\Helper.java**

- Helps with getting Passenger's Info and stores the associated bus and date information.

## Limitations

- No Database connectivity implemented.
- Multiple seats cannot be booked at one go.
- Not concentrated upon online payment functionality (as it is a console-based project.)
- No cancellation of tickets booked.

## Future Improvements

- Database connectivity with MYSQL using JDBC📅.
- Multiple seats would be booked at one go💺.
- Cancellation of tickets booked🎟️.
- Implementation of ADMIN dashboard for viewing of details👀.
- Building up a simple console UI for visualizing seats in the buses😍.
- Handling each and every possible exceptions (date inconsistency, input mismatch, ...)🦾.

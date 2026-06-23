🚌 Bus Ticket Booking System

📌 Project Overview

The Bus Ticket Booking System is a web-based application that allows users to search for buses, book tickets, and manage their bookings.It is designed to simulate a real-world online ticket booking platform with user authentication and database integration.

🚀 Features

User Registration and Login

Search Buses based on source and destination

View available buses and seat details

Book tickets

View booking history

Cancel bookings

Admin can manage bus details (optional if implemented)

🛠️ Technologies Used

Java

Servlet

JSP

JDBC

MySQL

HTML, CSS

Apache Tomcat Server

Eclipse IDE

Git & GitHub

🧩 Project Structure

Bus_Booking/
│── src/
│   ├── controller/
│   ├── dao/
│   ├── model/
│   └── util/
│
│── WebContent/
│   ├── jsp/
│   ├── css/
│   ├── images/
│   └── WEB-INF/
│       └── web.xml
│
│── database/
│   └── bus_booking.sql
│
│── screenshots/
│
│── README.md

⚙️ Setup Instructions

1. Clone the Repository

git clone https://github.com/yourusername/bus-booking-system.git

2. Import into IDE

Open Eclipse IDE

Import → Existing Projects into Workspace

3. Configure Server

Add Apache Tomcat Server

Deploy the project

4. Database Setup

Open MySQL

Create a database:

CREATE DATABASE bus_booking;

Import the SQL file:

bus_booking.sql

5. Update Database Configuration

Modify your DB connection in code:

URL = jdbc:mysql://localhost:3306/bus_booking
USERNAME = root
PASSWORD = your_password

6. Run the Project

Start Tomcat Server

Open browser:

http://localhost:8080/Bus_Booking

📷 Screenshots

(Add your project screenshots here)

Login Page

Register Page

Search Bus Page

Booking Page

🎯 Future Enhancements

Online payment integration

Seat selection UI

Email/SMS confirmation

REST API integration

Spring Boot migration

👤 Author

Seran M Java Full Stack Developer

📄 License

This project is for educational purposes.

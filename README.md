# 🚌 Bus Ticket Booking System

A web-based Bus Ticket Booking System developed using **Java, JSP, Servlet, JDBC, MySQL, Maven, and Apache Tomcat**. The application allows users to register, log in, view available buses, book seats, manage bookings, and enables administrators to manage bus details.

---

## 🚀 Features

* User Registration & Login
* View Available Buses
* Search Bus Routes
* Book Bus Seats
* View My Bookings
* Cancel Booking
* Admin Bus Management (Add, Edit, Delete)
* MySQL Database Integration
* Responsive JSP-based Interface

---

## 🛠 Technologies Used

* Java
* JSP
* Servlet
* JDBC
* MySQL 8.x
* Maven
* Apache Tomcat 8.5+
* HTML
* CSS
* Eclipse IDE

---

## 📁 Project Structure

```
BusTicket-Booking-System/
│
├── database/
│   └── bus_booking.sql
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── webapp/
│
├── pom.xml
├── README.md
```

---

## ⚙ Prerequisites

Before running the project, install:

* Java JDK 8 or above
* Eclipse IDE
* Apache Tomcat 8.5+
* MySQL Server 8.x
* Maven

---

## 🗄 Database Setup

Open MySQL Command Line or MySQL Workbench.

Create and import the database:

```sql
SOURCE database/bus_booking.sql;
```

Or manually:

```sql
CREATE DATABASE bus_booking;
USE bus_booking;
```

The SQL file automatically creates all required tables:

* user
* bus
* booking

and inserts sample bus records.

---

## 🔧 Database Configuration

Update `src/main/java/util/DBConnection.java`

```java
static String url="jdbc:mysql://localhost:3306/bus_booking";
static String user="root";
static String pass="root";
```

Replace the username and password according to your MySQL installation.

---

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/afrojstudent-lab/BusTicket-Booking-System.git
```

2. Import the project into Eclipse as a Maven Project.

3. Configure Apache Tomcat Server.

4. Import the database using:

```
database/bus_booking.sql
```

5. Run the project on Tomcat.

6. Open your browser:

```
http://localhost:8080/BusTicket-Booking-System/
```

---

## 📌 Database Tables

* user
* bus
* booking

---

## 👨‍💻 Author

**Palak**

GitHub:
https://github.com/afrojstudent-lab

---

## 📄 License

This project is developed for educational purposes.

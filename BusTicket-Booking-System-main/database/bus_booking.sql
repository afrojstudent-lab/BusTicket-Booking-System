-- =====================================
-- Bus Ticket Booking System Database
-- MySQL
-- =====================================

DROP DATABASE IF EXISTS bus_booking;
CREATE DATABASE bus_booking;

USE bus_booking;

-- =====================================
-- USER TABLE
-- =====================================

CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(20) NOT NULL
);

-- =====================================
-- BUS TABLE
-- =====================================

CREATE TABLE bus (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bus_name VARCHAR(100) NOT NULL,
    source VARCHAR(100) NOT NULL,
    destination VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL
);

-- =====================================
-- BOOKING TABLE
-- =====================================

CREATE TABLE booking (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    bus_id INT NOT NULL,
    passenger_name VARCHAR(100) NOT NULL,
    seat_number INT NOT NULL,

    CONSTRAINT fk_user
        FOREIGN KEY(user_id)
        REFERENCES user(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_bus
        FOREIGN KEY(bus_id)
        REFERENCES bus(id)
        ON DELETE CASCADE
);

-- =====================================
-- ADMIN ACCOUNT
-- =====================================

INSERT INTO user(username,password,role)
VALUES
('admin','admin123','admin');

-- =====================================
-- SAMPLE BUS DATA
-- =====================================

INSERT INTO bus(bus_name,source,destination,price) VALUES
('Volvo Express','Chennai','Bangalore',650),
('Green Travels','Chennai','Coimbatore',550),
('KPN Travels','Madurai','Chennai',700),
('SRM Travels','Trichy','Chennai',450),
('Orange Travels','Bangalore','Hyderabad',800),
('SRS Travels','Hyderabad','Chennai',900),
('Parveen Travels','Salem','Chennai',500),
('YBM Travels','Erode','Bangalore',650);

-- =====================================
-- SAMPLE USER
-- =====================================

INSERT INTO user(username,password,role)
VALUES
('student','1234','user');

-- =====================================
-- SAMPLE BOOKING
-- =====================================

INSERT INTO booking(user_id,bus_id,passenger_name,seat_number)
VALUES
(2,1,'Rahul',5);

-- =====================================
-- END
-- =====================================
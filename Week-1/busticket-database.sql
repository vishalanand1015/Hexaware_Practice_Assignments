create database busticketbooking;
use busticketbooking;
CREATE TABLE Admin (
    Admin_ID INT AUTO_INCREMENT PRIMARY KEY,
    First_Name VARCHAR(50) NOT NULL,
    Last_Name VARCHAR(50) NOT NULL,
    Email VARCHAR(100) NOT NULL UNIQUE,
    Password VARCHAR(100) NOT NULL,
    Phone_Number VARCHAR(15)
    
);
CREATE TABLE User_Customers (
    User_ID INT AUTO_INCREMENT PRIMARY KEY,
    First_Name VARCHAR(50) NOT NULL,
    Last_Name VARCHAR(50) NOT NULL,
    Email VARCHAR(100) NOT NULL UNIQUE,
    Password VARCHAR(100) NOT NULL,
    Phone_Number VARCHAR(15),
    Address VARCHAR(255),
    City VARCHAR(50),
    State VARCHAR(50),
    ZipCode VARCHAR(10)
    
);
CREATE TABLE BusOperators (
    Operator_ID INT AUTO_INCREMENT PRIMARY KEY,
    Operator_Name VARCHAR(50) NOT NULL,
    ContactPhone VARCHAR(15),
    Rating DECIMAL(3, 2),
    User_Id INT,
    FOREIGN KEY (User_ID) REFERENCES User_Customers(User_ID)
);
CREATE TABLE Buses (
    Bus_ID INT AUTO_INCREMENT PRIMARY KEY,
    Operator_ID INT,
    BusNumber VARCHAR(20) NOT NULL,
    Capacity INT NOT NULL,
    User_ID INT,
    FOREIGN KEY (User_ID) REFERENCES User_Customers(User_ID),
    FOREIGN KEY (Operator_ID) REFERENCES BusOperators(Operator_ID)
);

CREATE TABLE Trips (
    Trip_ID INT AUTO_INCREMENT PRIMARY KEY,
    Bus_ID INT,
	Operator_ID INT,
    Source_City VARCHAR(50) NOT NULL,
    Destination_City VARCHAR(50) NOT NULL,
    DistanceInKms DECIMAL(10, 2) NOT NULL,
    DurationInHours DECIMAL(5, 2) NOT NULL,
    Departure_Time DATETIME NOT NULL,
    Fare DECIMAL(8, 2) NOT NULL,
    User_ID INT,
    FOREIGN KEY (User_ID) REFERENCES User_Customers(User_ID),
    FOREIGN KEY (Operator_ID) REFERENCES BusOperators(Operator_ID),
    FOREIGN KEY (Bus_ID) REFERENCES Buses(Bus_ID)
 
);
CREATE TABLE Bookings (
    Booking_ID INT AUTO_INCREMENT PRIMARY KEY,
    User_ID INT,
    Trip_ID INT,
    Booking_Time DATETIME NOT NULL,
    Seat_Number INT NOT NULL,
    Booking_Status VARCHAR(20),
    
    FOREIGN KEY (User_ID) REFERENCES User_Customers(User_ID),
    FOREIGN KEY (Trip_ID) REFERENCES Trips(Trip_ID)
);
CREATE TABLE PAYMENT_HISTORY(
	Payment_Id INT AUTO_INCREMENT PRIMARY KEY,
    Booking_ID INT(11),
    Amount_Paid FLOAT,
    Payment_Date DATE NOT NULL,
    User_ID INT,
    FOREIGN KEY (Booking_ID) REFERENCES Bookings(Booking_ID),
    FOREIGN KEY (User_ID) REFERENCES User_Customers(User_ID)
);
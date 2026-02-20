CREATE DATABASE wtpr6db;

USE wtpr6db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    mobile VARCHAR(15),
    gender VARCHAR(10),
    dob DATE,
    address TEXT,
    password VARCHAR(100)
);

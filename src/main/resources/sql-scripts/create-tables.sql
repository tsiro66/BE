-- Script to create patient table
CREATE TABLE patient (
    patient_id VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    dob DATE NOT NULL,
    gender VARCHAR(10) NOT NULL
);

-- Script to create appointment table
CREATE TABLE appointment (
    appointment_id VARCHAR(50) PRIMARY KEY,
    patient_id VARCHAR(50) NOT NULL,
    appointment_date_time TIMESTAMP NOT NULL,
    description TEXT,
    FOREIGN KEY (patient_id) REFERENCES patient(patient_id)
);

-- Script to create user table
-- Create an ENUM type for roles
CREATE TYPE user_role AS ENUM ('USER', 'ADMIN');

-- Create the User table
CREATE TABLE "User" (
    "UserId" SERIAL PRIMARY KEY,       -- Auto-incrementing integer
    "username" VARCHAR(255) NOT NULL UNIQUE,
    "password" VARCHAR(255) NOT NULL,
    "role" user_role NOT NULL
);
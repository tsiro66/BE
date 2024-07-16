CREATE TABLE IF NOT EXISTS patients (
    patient_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    dob DATE,
    gender VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS appointments (
    appointment_id SERIAL PRIMARY KEY,
    patient_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME,
    description TEXT,
    FOREIGN KEY (patient_id) REFERENCES patients(patient_id)
);

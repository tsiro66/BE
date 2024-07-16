INSERT INTO patients (first_name, last_name, dob, gender) VALUES
('John', 'Doe', '1990-05-15', 'Male'),
('Jane', 'Smith', '1985-09-20', 'Female');

INSERT INTO appointments (patient_id, appointment_date, appointment_time, description) VALUES
(1, '2024-07-17', '10:00', 'Routine checkup'),
(2, '2024-07-18', '14:30', 'Follow-up visit');

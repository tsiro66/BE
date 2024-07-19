-- Insert demo data into patient table
INSERT INTO patient (patient_id, first_name, last_name, dob, gender) VALUES
('1', 'John', 'Doe', '1980-05-15', 'Male'),
('2', 'Maria', 'Callas', '1923-12-02', 'Female'),
('3', 'Jane', 'Smith', '1990-08-25', 'Female');

-- Insert demo data into appointment table
INSERT INTO appointment (appointment_id, patient_id, appointment_date_time, description) VALUES
('1', '1', '2024-07-18T10:00:00', 'Annual physical check-up'),
('2', '2', '2024-07-18T11:00:00', 'Follow-up appointment for diabetes management'),
('3', '3', '2024-07-18T12:00:00', 'Consultation for skin rash treatment');

-- Insert demo data into user table
INSERT INTO user (username, password, role) VALUES ('user', '$2a$10$7QJZ2N5qKjD/MZrE5XDAI.vkexGzHBuNcbbwrZ1gE8OXpeJqJDzFu', 'USER');  -- password is "password"
INSERT INTO user (username, password, role) VALUES ('admin', '$2a$10$eW5sGx2ci3pYuFwRE/hAe.6ZMLQDj.Z3VQzRP2EXCNbkGz9as.zxK', 'ADMIN'); -- password is "adminpass"

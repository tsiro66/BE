-- Insert demo data into patient table
INSERT INTO "patient" (patient_id, first_name, last_name, dob, gender) VALUES
('1', 'John', 'Doe', '1980-05-15', 'Male'),
('2', 'Maria', 'Callas', '1923-12-02', 'Female'),
('3', 'Jane', 'Smith', '1990-08-25', 'Female'),
('4', 'Alice', 'Johnson', '1975-09-12', 'Female'),
('5', 'Michael', 'Brown', '1982-11-30', 'Male'),
('6', 'Emily', 'Davis', '1995-03-14', 'Female'),
('7', 'James', 'Wilson', '1988-06-22', 'Male'),
('8', 'Sophia', 'Martinez', '2000-01-05', 'Female'),
('9', 'William', 'Garcia', '1992-07-29', 'Male'),
('10', 'Olivia', 'Anderson', '1985-02-19', 'Female');


-- Insert demo data into appointment table
INSERT INTO "appointment" (appointment_id, patient_id, appointment_date, description) VALUES
('1', '1', '2024-07-18', 'Annual physical check-up'),
('2', '2', '2024-07-18', 'Follow-up appointment for diabetes management'),
('3', '3', '2024-07-18', 'Consultation for skin rash treatment'),
('4', '4', '2024-07-19', 'Orthopedic consultation for knee pain'),
('5', '5', '2024-07-19', 'Routine dental check-up'),
('6', '6', '2024-07-20', 'Eye examination and new glasses prescription'),
('7', '7', '2024-07-20', 'Follow-up on hypertension treatment'),
('8', '8', '2024-07-21', 'Vaccination appointment'),
('9', '9', '2024-07-21', 'Nutritional consultation'),
('10', '10', '2024-07-22', 'Psychological counseling session');

-- Insert demo data into user table
INSERT INTO "user" (username, password) VALUES ('user', '$2a$12$cyKrZR/mnY5hL0gVNn.hQe1jeBx7zY.cPChtNBUqJGFD.48zHRZfq');  -- password is "password"

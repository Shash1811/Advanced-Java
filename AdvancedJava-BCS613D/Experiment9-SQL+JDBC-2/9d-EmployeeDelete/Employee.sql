-- 9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
-- Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
-- follows using HTML and JSP to get the field and display the results respectively

-- Salary Report

-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
-- Emp_No : 101
-- Emp_Name: Ramesh'
-- Basic : 25000
-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
-- Emp_No : 102
-- Emp_Name: Ravi
-- Basic : 20000
-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
CREATE DATABASE Employee;

USE Employee;

CREATE TABLE Emp (
    Emp_NO INTEGER PRIMARY KEY,
    Emp_Name TEXT NOT NULL,
    Basicsalary INTEGER
);

-- Optional: Insert sample data
INSERT INTO Emp VALUES (101, 'Ramesh', 25000);
INSERT INTO Emp VALUES (102, 'Ravi', 20000);
INSERT INTO Emp VALUES (103, 'Suresh', 22000);
INSERT INTO Emp VALUES (104, 'Sunil', 18000);

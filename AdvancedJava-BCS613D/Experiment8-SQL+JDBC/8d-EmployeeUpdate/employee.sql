// //8d. Develop a JDBC project using JSP to update the fields empno, empname and basicsalary into
// the table Emp of the database Employee by getting the fields through keyboard.
CREATE DATABASE Employee;

USE Employee;

CREATE TABLE Emp (
    empno INT PRIMARY KEY,
    empname VARCHAR(50),
    basicsalary DOUBLE
);

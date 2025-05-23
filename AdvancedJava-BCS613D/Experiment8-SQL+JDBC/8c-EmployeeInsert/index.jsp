<!-- 8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
-- into the table Emp of the database Employee by getting the fields through keyboard and
-- Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
-- HTML and JSP to get the fields and display the results respectively

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
-- ....
-- ...
-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
-- Grand Salary : 45000
-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <h2>Enter Employee Details</h2>
    <form action="addEmp.jsp" method="post">
        Emp No: <input type="text" name="empno" required><br><br>
        Emp Name: <input type="text" name="empname" required><br><br>
        Basic Salary: <input type="text" name="basicsalary" required><br><br>
        <input type="submit" value="Add Employee">
    </form>
    <br>
    <a href="report.jsp">View Salary Report</a>
</body>
</html>

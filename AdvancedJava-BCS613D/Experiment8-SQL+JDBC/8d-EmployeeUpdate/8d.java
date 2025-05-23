// //8d. Develop a JDBC project using JSP to update the fields empno, empname and basicsalary into
// the table Emp of the database Employee by getting the fields through keyboard.
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee Details</h2>
    <form action="result.jsp" method="post">
        Employee Number: <input type="text" name="empno" required><br><br>
        Employee Name: <input type="text" name="empname" required><br><br>
        Basic Salary: <input type="text" name="basicsalary" required><br><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>

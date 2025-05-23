<!-- 8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
....
...
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
`
Grand Salary : 45000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Salary Report</title>
</head>
<body>
    <h2>Salary Report</h2>
    <pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    double total = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "yourpassword");

        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
            int empNo = rs.getInt("Emp_No");
            String empName = rs.getString("Emp_Name");
            double basic = rs.getDouble("BasicSalary");
            total += basic;

%>
Emp_No : <%= empNo %>
Emp_Name: <%= empName %>
Basic : <%= basic %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        }
%>
Grand Salary : <%= total %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }
%>
</pre>
<a href="index.jsp">Back to Form</a>
</body>
</html>

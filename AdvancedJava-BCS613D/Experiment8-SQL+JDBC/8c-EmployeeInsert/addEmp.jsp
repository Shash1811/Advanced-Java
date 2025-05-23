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
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "yourpassword");

        String sql = "INSERT INTO Emp (Emp_No, Emp_Name, BasicSalary) VALUES (?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, Integer.parseInt(empno));
        pstmt.setString(2, empname);
        pstmt.setDouble(3, Double.parseDouble(basicsalary));

        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            out.println("<h3>Employee added successfully!</h3>");
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
%>
<a href="index.jsp">Back to Form</a> | <a href="report.jsp">View Salary Report</a>

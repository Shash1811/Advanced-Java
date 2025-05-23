<!-- 8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively -->
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

        String sql = "UPDATE Emp SET Emp_Name = ?, BasicSalary = ? WHERE Emp_No = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, empname);
        pstmt.setDouble(2, Double.parseDouble(basicsalary));
        pstmt.setInt(3, Integer.parseInt(empno));

        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            out.println("<h3>Employee details updated successfully!</h3>");
        } else {
            out.println("<h3>No employee found with Emp_No: " + empno + "</h3>");
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
%>
<a href="report.jsp">View Salary Report</a> | <a href="index.jsp">Back to Add Employee</a>

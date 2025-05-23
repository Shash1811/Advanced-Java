<!-- // //8d. Develop a JDBC project using JSP to update the fields empno, empname and basicsalary into
// the table Emp of the database Employee by getting the fields through keyboard. -->
<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

        String sql = "UPDATE Emp SET empname = ?, basicsalary = ? WHERE empno = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, empname);
        ps.setDouble(2, Double.parseDouble(basicsalary));
        ps.setInt(3, Integer.parseInt(empno));

        int rows = ps.executeUpdate();
        if (rows > 0) {
            out.println("<h3>Employee record updated successfully!</h3>");
        } else {
            out.println("<h3>Employee not found!</h3>");
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (ps != null) ps.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
<a href="update.jsp">Back to Update Form</a>

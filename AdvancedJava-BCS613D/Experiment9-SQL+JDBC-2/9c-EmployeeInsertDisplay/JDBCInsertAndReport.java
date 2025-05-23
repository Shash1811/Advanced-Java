// 9c. Develop a JDBC project using MySQL to append the fields empno, empname and
// basicsalary into the table Emp of the database Employee by getting the fields through keyboard
// and Generate the report as follows
// CREATE TABLE Emp (
// Emp_NO INTEGER PRIMARY KEY,
// Emp_Name TEXT NOT NULL,
// Basicsalary INTEGER
// );
// -- insert
// INSERT INTO EMPLOYEE VALUES (101, 'Ramesh', 25000);
// INSERT INTO EMPLOYEE VALUES (102, 'Ravi', 20000);
// .....
// Add 5 records into Emp table of Employee database through Java with JDBC
// and generate a salary report as follows by executing query Emp name starting with R
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````

// Salary Report

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Emp_No : 101
// Emp_Name: Ramesh'
// Basic : 25000
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Emp_No : 102
// Emp_Name: Ravi
// Basic : 20000

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// ....
// ...
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~````
import java.sql.*;
import java.util.Scanner;

public class JDBCInsertAndReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // JDBC credentials
        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";
        String password = "your_password"; // Replace with your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // Prepare statement to insert employee records
            String insertSQL = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);

            System.out.println("Enter 5 employee details:");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Employee #" + i);
                System.out.print("Enter Employee Number: ");
                int empNo = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter Employee Name: ");
                String empName = scanner.nextLine();
                System.out.print("Enter Basic Salary: ");
                int salary = scanner.nextInt();

                ps.setInt(1, empNo);
                ps.setString(2, empName);
                ps.setInt(3, salary);
                ps.executeUpdate();
            }

            System.out.println("\n~~~ Salary Report (Names starting with 'R') ~~~");

            // Query to fetch employees with names starting with R
            String reportSQL = "SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(reportSQL);

            while (rs.next()) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Emp_No   : " + rs.getInt("Emp_NO"));
                System.out.println("Emp_Name : " + rs.getString("Emp_Name"));
                System.out.println("Basic    : " + rs.getInt("Basicsalary"));
            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            // Close connections
            ps.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        // MySQL connection object and PreparedStatement for database interaction
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", ""); // Update with actual password if required

            // Prepare SQL query to insert data
            String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, course);

            // Execute the update (insert data)
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                // Data inserted successfully, redirect to success page
                response.sendRedirect("success.jsp");
            } else {
                // If no rows are affected, inform the user
                response.getWriter().println("Error: Data insertion failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            // Print error message to client-side
            response.getWriter().println("Database error: " + e.getMessage());
        } finally {
            // Always close resources in the 'finally' block
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

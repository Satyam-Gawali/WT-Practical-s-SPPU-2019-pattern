import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String address = request.getParameter("address");
        String password = request.getParameter("password");

        Connection con = DBConnection.getConnection();

        try {
            if (con != null) {
                String sql = "INSERT INTO users (name, email, mobile, gender, dob, address, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, mobile);
                stmt.setString(4, gender);
                stmt.setString(5, dob);
                stmt.setString(6, address);
                stmt.setString(7, password);

                int rowsInserted = stmt.executeUpdate();

                if (rowsInserted > 0) {
                    out.println("<h3> Registration successful!</h3>");
                } else {
                    out.println("<h3> Registration failed.</h3>");
                }

                stmt.close();
                con.close();
            } else {
                out.println("<h3> Could not connect to database.</h3>");
            }
        } catch (Exception e) {
            out.println("<h3> Error: " + e.getMessage() + "</h3>");
            e.printStackTrace(out);
        }

        out.println("<br><a href='index.html'>Go Back</a>");
    }
}

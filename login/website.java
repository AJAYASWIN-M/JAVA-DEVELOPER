package ajay;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class website
 */
@WebServlet("/website")
public class website extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ajay_db";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "root";
   
    
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username"); // Match 'username' from the HTML form
        String password = request.getParameter("password"); // Match 'password' from the HTML form
        response.setContentType("text/html");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            String sql = "INSERT INTO login_table (name, pass) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, password);

            int rowsInserted = pstmt.executeUpdate();
            PrintWriter out = response.getWriter();
            if (rowsInserted > 0) {
                out.println("<h1>Registration Successful!</h1>");
            } else {
                out.println("<h1>Registration Failed!</h1>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h1>An error occurred: " + e.getMessage() + "</h1>");
        }
    }
}

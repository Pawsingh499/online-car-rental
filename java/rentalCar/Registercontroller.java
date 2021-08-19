package rentalCar;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registercontroller")
public class Registercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Registercontroller() {
        super();
    }

	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		
			response.setContentType("text/html");
			
			
			String name = request.getParameter("name");
			String email = request.getParameter("emailid");
			int userId = Integer.parseInt(request.getParameter("userId"));
			String city = request.getParameter("city");
			String password = request.getParameter("password");
			String confirm_pass = request.getParameter("confirm");
			String address = request.getParameter("address");
			String phone= request.getParameter("phone");
			String active = request.getParameter("active");
			try
			{
				PrintWriter out = response.getWriter();	
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rentacar","root","bukati");  
		
				
			
			if(password.equals(confirm_pass))	
			{
				
			String str="Insert into user values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1, userId);
		    ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, city);
            ps.setString(6, phone);
            ps.setString(7,password);
            ps.setString(8, active);
            
			
			ps.executeUpdate();
			
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Sign Up Successful');");  
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			
			}
			
			else
			{	

				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Password dooesn't match');");  
				out.println("</script>");
				
				RequestDispatcher rd = request.getRequestDispatcher("unsuccessful.jsp");
				rd.forward(request, response);
			}
			
			
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
		
			

		}
}

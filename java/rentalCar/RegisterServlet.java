package rentalCar;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet("/RegisterServlet") 
public class RegisterServlet extends HttpServlet {
 
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
     }

     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         String name = request.getParameter("name");
         String email = request.getParameter("email");
         String address = request.getParameter("address");
         String pwd = request.getParameter("password");
         String city = request.getParameter("city");
         String phone = request.getParameter("phone");
         String active = request.getParameter("active");
         int UserId = Integer.parseInt(request.getParameter("userid"));
         
         
          User user = new User();
        //Using Java Beans - An easiest way to play with group of related data
          user.setName(name);
          user.setEmail(email);
          user.setAddress(address);
          user.setCity(city);
          user.setPhone(phone);
          user.setPwd(pwd);
          user.setActive(active);
          user.setUserId(UserId);
         
         RegisterDao registerDao = new RegisterDao();
         
        //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
         String userRegistered = registerDao.registerUser(user);
         
         if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
         {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/register.jsp").forward(request, response);
         }
     }
}
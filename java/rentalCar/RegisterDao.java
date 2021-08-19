package rentalCar;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class RegisterDao { 
     public String registerUser(User user)
     {
         String name = user.getName();
         String email = user.getEmail();
         String address = user.getAddress();
         String pwd = user.getPwd();
         String city = user.getCity();
         String phone = user.getPhone();
         int userId = user.getUserId();
         String  active = user.getActive();
         Connection con = null;
         PreparedStatement preparedStatement = null;         
         try
         {


             con = ConnectionProvider.getConnection();
             String query = "insert into user(UserId,name,email,address,city,phone,pwd,active) values (?,?,?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
             preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
             preparedStatement.setString(2, name);
             preparedStatement.setString(3, email);
             preparedStatement.setString(4, address);
             preparedStatement.setString(5, city);
             preparedStatement.setString(6, phone);
             preparedStatement.setString(7,pwd);
             preparedStatement.setString(8, active);
             preparedStatement.setInt(1, userId);
             int i= preparedStatement.executeUpdate();
             
             if (i!=0)  //Just to ensure data has been inserted into the database
             return "SUCCESS"; 
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }       
         return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
     }
}
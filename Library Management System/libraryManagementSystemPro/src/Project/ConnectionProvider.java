package Project;
import java.sql.*;

/**
 *
 * @author WAMIQUE
 */
public class ConnectionProvider {
    public static Connection getCon(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb?useSSL=false",
                    "root",
                    "mysql1@123");
            return conn;

        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
    }
}
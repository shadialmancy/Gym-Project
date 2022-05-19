
import java.sql.*;

public class conn {
    public static Connection connetdb() throws ClassNotFoundException{
        Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=PDB;user=admin;password=2018030061";
        
        try{
            con=DriverManager.getConnection(connectionURL);
            System.out.println("Connection is successfull");
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return con;
    }

}
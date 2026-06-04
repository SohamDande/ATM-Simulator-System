import java.sql.*;

public class connection 
{
    Connection c;
    Statement s;
    public connection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "YOUR_PASSWORD_HERE");
            s = c.createStatement();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

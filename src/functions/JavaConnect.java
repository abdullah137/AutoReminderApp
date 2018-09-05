package functions;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JavaConnect {
    
     Connection conn = null;
    
    public static Connection ConnectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\my\\Documents\\NetBeansProjects\\WeatherApp\\src\\weatherapp\\AutoReminderApp\\Database.db");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "It's it not working");
        }
         return null;
    }
    
    public static void main(String args[]) {
        ConnectDB();
    }
    
}

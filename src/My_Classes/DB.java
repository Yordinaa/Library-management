package My_Classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public DB() {

    }

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "");
        } catch (Exception var2) {
            System.out.println(var2);
        }

        return con;
    }
}

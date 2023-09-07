package My_Classes.Librarian;

import My_Classes.DB;

import java.sql.*;

public class BookDao {

    public static int deleteBookByCallNo(String callno) {

        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from books where callno = ?");
            ps.setString(1, callno);

            status = ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

}
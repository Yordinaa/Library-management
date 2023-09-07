package My_Classes.student;

import My_Classes.DB;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class ViewStudent extends JFrame {
    private JPanel contentPane;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewStudent frame = new ViewStudent();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public ViewStudent() {
        this.setDefaultCloseOperation(1);
        this.setBounds(100, 100, 600, 550);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setContentPane(this.contentPane);
        String[][] data = null;
        String[] column = null;

        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from student", 1005, 1008);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            column = new String[cols];
//            The for loop iterates through each column in the result set,
//            retrieves the name of the column using the getColumnName() method
            int rows;
       for(rows = 1; rows <= cols; ++rows) {
                column[rows - 1] = rsmd.getColumnName(rows);
            }

            rs.last();
            rows = rs.getRow();
            rs.beforeFirst();
            data = new String[rows][cols];

            for(int count = 0; rs.next(); ++count) {
                for(int i = 1; i <= cols; ++i) {
                    data[count][i - 1] = rs.getString(i);
                }
            }

            con.close();
        } catch (Exception var11) {
            System.out.println(var11);
        }

        this.table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(this.table);
        this.contentPane.add(sp, "Center");
    }
}


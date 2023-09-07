package My_Classes;

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

public class ViewBooks extends JFrame {
    private JPanel contentPane;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewBooks frame = new ViewBooks();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public ViewBooks() {
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
            PreparedStatement ps = con.prepareStatement("select * from books", 1005, 1008);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            column = new String[cols];

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


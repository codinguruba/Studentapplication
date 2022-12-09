
package studentsystem;

import java.util.*;
import java.sql.*;

public class StudentImp implements Crud {

    Connection con;

    
    @Override
    public void createStudent(Student std) {
        con = DBConnection.createConnection();
        String query = "insert into student values(?,?,?,?)";
        try {
            PreparedStatement pt = con.prepareStatement(query);
            pt.setInt(1, std.getSid());
            pt.setString(2, std.getName());
            pt.setString(3, std.getAddress());
            pt.setDouble(4, std.getMarks());
            int c = pt.executeUpdate();
            if (c != 0) {
                System.out.println("Student Inserted Successfull...");

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void showAllStudent() {
        con = DBConnection.createConnection();
        String query = "select * from student";
        System.out.println("Employee Details:");
        System.out.println("--------------------------------");
        System.out.format("%s\t%s\t%s\t%s\n", "ID", "Name", "Address", "Marks");
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.format("%d\t%s\t%s\t%d\n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
                System.out.println("----------------------------------------");


            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
  
    @Override
    public void updateStudent(int id, String name) {
        con = DBConnection.createConnection();
        String query = "update employee set name=? where id=?";
        try {
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, name);
            pt.setInt(2, id);
            int c = pt.executeUpdate();
            if (c != 0) {
                System.out.println("Employee Details updated successfully !!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteStudent(int id) {
        con = DBConnection.createConnection();
        String query = "delete from employee where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            int cnt = pstm.executeUpdate();
            if (cnt != 0) {
                System.out.println("Student Deleted Successfully!!! " + id);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

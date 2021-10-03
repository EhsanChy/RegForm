package Ehsan.Pakage;
import java.sql.*;
import javax.swing.JOptionPane;

class DbConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DbConnect() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cse","root","");
            st= con.createStatement();

        }catch (Exception e){
            System.err.println("Error: " +e);
        }
    }
    public void RegisterInsert(String queryInsert){
        try{
            st.executeUpdate(queryInsert);
            JOptionPane.showMessageDialog(null,"Registration Complete!! ");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Not Inserted!!" +ex);
        }
    }
}

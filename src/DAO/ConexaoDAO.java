package DAO;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
/**
 *
 * @author dougd
 */
public class ConexaoDAO {
    
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost/dbbiblioteca?user=root&password=Dalo@2001";
            conn = (Connection) DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conn;
    }
    
}

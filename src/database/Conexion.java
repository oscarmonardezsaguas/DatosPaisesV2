
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
        private final String DRIVER="com.mysql.cj.jdbc.Driver";
        private final String URL="jdbc:mysql://localhost:3306/";
        private final String DB="ventas";
        private final String USER="root";
        private final String PASSWORD="";
        
        public Connection cadena;

        public Conexion() {
            this.cadena=null;
        }
        
        public Connection  conectar() {
                try {
                        Class.forName(DRIVER);
                        this.cadena=DriverManager.getConnection(URL+DB,USER,PASSWORD);
                } catch (ClassNotFoundException  | SQLException e) {
                        JOptionPane.showConfirmDialog(null, e.getMessage());
                        System.exit(0);
                }
                return this.cadena;
        }        
        
        public void desconectar(){
                try {
                        this.cadena.close();
                } catch (SQLException e) {
                    JOptionPane.showConfirmDialog(null, e.getMessage());                  
                }                
        }
}

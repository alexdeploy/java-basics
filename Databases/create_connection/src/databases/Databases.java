/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;
import java.sql.*;

/**
 *
 * @author alexs
 */
public class Databases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        /**
         * Cargamos el driver JBDC de java.
         */
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            
            String url = "jdbc:mysql://localhost:3306/prueba?zeroDateTimeBehavior=CONVERT_TO_NULL";
            
            Connection conn = DriverManager.getConnection(url,"root","");
            
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            // Obtenemos los datos de la tabla en un ResultSet:
            ResultSet rs = st.executeQuery("SELECT * FROM persona");
            
            
            rs.moveToInsertRow();
            rs.updateInt("id",02);
            rs.updateString("nombre","Carlos");
            rs.updateString("apellidos","Garcia");
            rs.updateString("dni","18394834F");
            rs.insertRow();
            
            
            // Cerrar el statement y la conexión
            
            st.close();
            conn.close();
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
        
            // Se maneja la excepción.
        
        }
    
    }
    
}

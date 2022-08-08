/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabook;

import com.sun.jdi.connect.spi.Connection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexs
 */
// Conexión a la base de datos
   
public class BasesDeDatos {
    
    try{
        // 1º Load driver
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // Load JDBC Driver
        System.out.println("Driver loaded.");
        
        // 2º Create connection to database
        String url = "jdbc:mysql://localhost:3306/javabook?zeroDateTimeBehavior=CONVERT_TO_NULL"; // Database URL
        java.sql.Connection conn = DriverManager.getConnection(url,"root",""); // Create connection
        System.out.println("Connected.");
        
        // 3º Create a statement for executing queries.
        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // Crea un Statement de la conexión

        // 4º Create a query and execute it .
        String sql = "SELECT * FROM usuarios";
        ResultSet rs = st.executeQuery(sql); // Execute query with ResultSet class

        // INSTRUCCIONES PARA MANIPULAR LA BASE DE DATOS
        
        // INSERTAR FILAS
        rs.moveToInsertRow(); // Mueve el cursor al registro
        rs.updateString("nombre", "Juan"); // Update de string "Nombre" o Fila 1
        rs.updateInt("edad", 15); // Update de int
        rs.updateInt("id", 10005);
        rs.insertRow(); // Inserta los datos en la tabla de la base de datos // HAY QUE PONERLO DESPUÉS DE CADA ROW INSERTADO
        rs.updateString("nombre", "Joaquin");
        rs.updateInt("edad", 25);
        rs.updateInt("id", 10006);
        rs.insertRow(); // Inserta los datos en la tabla de la base de datos
        
        File doc = new File("doc.txt"); // Instancio el objeto File
        
        while(rs.next()){ // Recorre la tabla obtenida de la consulta en el ResultSet
               
               String nombre = rs.getString("nombre");
               int edad = rs.getInt("edad");
               int id = rs.getInt("id");
               System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nID: " + id);
           }
        st.close(); // Cierra el Statement
        conn.close(); // Cierra la conexión

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    
    public static void loadDriver() throws InstantiationException, IllegalAccessException{
        
    try { // Siempre debe llevar un try-catch para manejar las excepciones.
        
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // Indicamos que driver vamos a utilizar con Class.forName()
            
        } catch (ClassNotFoundException ex) {
            
            ex.printStackTrace();
        }
    }
    
    // DRIVER MANAGER
    
    /*
    La clase java.sql.DriverManager es la capa gestora del driver JDBC. Se
    encarga de manejar el Driver apropiado y permite crear conexiones con una
    base de datos mediante el método estático getConnection(…)
    */
    private static java.sql.Connection conn = null;
    
    public static void driverManager() throws Exception{
        
        try{
        String url = "jdbc:mysql://localhost:3306/javabook?zeroDateTimeBehavior=CONVERT_TO_NULL";
        Connection conn = DriverManager.getConnection(url,"root","");
        } catch (Exeption e){
            
        }
        
    }
    
    // Si la conexión es satisfactoria devolverá un objeto Connection.
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////// M É T O D O S /////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    /*
    El método más relevante es createStatement() que devuelve un objeto
    Statement asociado a dicha conexión que permite ejecutar sentencias SQL. El
    método createStatement() puede lanzar excepciones de tipo SQLException
    
    
    public static void createStatement(){
        
        Statement st = conn.createStatement();
        
        conn.close();
        
    }
    
    
    Un objeto java.sql.Statement permite ejecutar sentencias SQL en la base
    de datos s a través de la conexión con la que se creó el Statement.
    Los tres métodos más comunes de ejecución de sentencias SQL son
    executeQuery(…), executeUpdate(…) y execute(…). Pueden lanzar excepciones
    de tipo SQLException y SQLTimeoutException.
    
    - ResultSet executeQuery(String sql): Ejecuta la sentencia sql indicada
    (de tipo SELECT). Devuelve un objeto ResultSet con los datos
    proporcionados por el servidor.
    
    - int executeUpdate(String sql): Ejecuta la sentencia sql indicada (de
    tipo DML como por ejemplo INSERT, UPDATE o DELETE). Devuelve un el
    número de registros que han sido insertados, modificados o eliminados.
    
    
    */
    
    ////////////////////////////////////////////////////////////////////////////
    ///////////   A C C E D E R   A   B A S E S   D E   D A T O S //////////////
    ////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    ///////////////////// H A C K S   &   T R I C K S //////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    // COPIAR TEXTO DE BASE DE DATOS A FICHERO.
    
    public static void copiarAFichero(File f, String usuario, int edad) throws IOException{
        
        File doc = new File("doc.txt"); // Instancio el objeto File
        
        // Instancio el objeto FileWriter en doc, con append true para que no sobreescriba
        FileWriter writer = new FileWriter(doc, true); 
        
        writer.write(usuario); // Escribo el texto guardado en el String usuario.
        writer.write(" " + edad); // Escribo el valor de "edad" con un " " para que lo escriba en número.
        writer.write("\n"); // Salto de linea
        writer.close(); // Cierro escaner
    }
    
    // COPIAR TEXTO DE FICHERO A BASE DE DATOS
    
    public static void copiarABaseDeDatos(File f) throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // Cargo el Driver
        
        String url = "jdbc:mysql://localhost:3306/javabook?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String USER = "root";
        String PASS = "";
        
        java.sql.Connection conn = DriverManager.getConnection(url,USER,PASS); // Creo una conexion a la base de datos
        
        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        String sql = "SELECT * FROM usuarios";
        
        ResultSet rs = st.executeQuery(sql);
        
        
        
        Scanner sc = new Scanner(f);
        FileWriter writer = new FileWriter(f);
        
        while(sc.hasNext()){
            
            String nombre = sc.next();
            int edad = sc.nextInt();
            String id = sc.next();
            rs.moveToInsertRow();
            rs.updateString("nombre",nombre);
            rs.updateInt("edad",edad);
            rs.updateString("id",id);
            rs.insertRow();
        }
        
    }
    
}

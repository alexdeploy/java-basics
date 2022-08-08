/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create_and_write_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alexruedadev
 */
public class create_and_write_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Strings for the file names
        String file = "Documents";
        String path = "Documents/bbdd.txt";
        
        try {

            // Create a file
            File dir = new File(file);
            File bbdd = new File(path);

            // Create new directory if it doesn't exist
            dir.mkdir();
            
            // Create new file if it doesn't exist
            bbdd.createNewFile();
            
            // Create new file writer
            FileWriter fw = new FileWriter(bbdd);
            
            // Get input from user and write to file
            System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();
                
            // Get input from user and write to file
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            
            // Get input from user and write to file
            System.out.println("Contraseña: ");
            String password = sc.nextLine();
            
            // Write to file all the information
            fw.write(nombre + ";" + edad + ";" + password + ";" + "\n");
            
            // Close file writer
            fw.close();

            // Close scanner
            sc.close();
            
            // Print file content
            printFileLine(bbdd);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Print the content of a file (just first line)
     * @param data File to print.
     * @throws FileNotFoundException
     */
    public static void printFileLine(File data) throws FileNotFoundException{
    
        // Create new scanner to scan file
        Scanner sc = new Scanner(data);
        
        // Print file content
        String[] datos = sc.nextLine().split(";");
        System.out.println("Name:" + datos[0] + "\nAge: " + datos[1] + "\nPassword: " + datos[2]);
        
        sc.close();
    }

    /**
     * Print all the content of a file
     * @param data
     * @throws FileNotFoundException
     */
    public static void printFile(File data) throws FileNotFoundException{
        
        // Create new scanner to scan file
        Scanner reader = new Scanner(data);
        
        // Print file content
        while(reader.hasNextLine()){
            String[] datos = reader.nextLine().split(";");
            System.out.println("Name:" + datos[0] + "\nAge: " + datos[1] + "\nPassword: " + datos[2] + "\n");
        }
        
        reader.close();
    }
    
}

        // CREAR CARPETAS
        /*
        System.out.println("Carpeta fotos creada? " + fotos.mkdir());
        System.out.println("Carpeta musica creada? " + musica.mkdir());
        System.out.println("Archivo media creado? " + media.mkdir());
        */
        // BORRAR CARPETAS
        /* 
        System.out.println("Archivo media borrado? " + media.delete());
        System.out.println("Carpeta fotos borrada? " + fotos.delete());
        System.out.println("Carpeta musica borrada? " + musica.delete());
        */
        // MODIFICAR CARPETAS
        /*
        System.out.println("Archivo media cambiado de carpeta? " + newMedia.renameTo(media));
        */

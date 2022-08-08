/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throw_exception_from_class_constructor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alexruedadev
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        // Cats ArrayList
        ArrayList<Cat> lista = new ArrayList();
        
        // Variables
        String nombre;
        int edad;
        
        // Input data
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Introduce nombre del gato numero " + i + ": ");
        
            nombre = sc.nextLine();
        
            System.out.println("Introduce edad del gato: ");
            
            edad = sc.nextInt();

            sc.nextLine(); // Fix Scanner bug
            
            Cat g = new Cat(nombre, edad);
            
            lista.add(g);
        
        }
        sc.close();
        printArray(lista);
    }
    
    /**
     * Prints the array of cats
     * @param list ArrayList of cats
     */
    public static void printArray (ArrayList<Cat> list){
        
        for (int i = 0; i < list.size(); i++) {
            Cat g = list.get(i);
            g.printData();
        }
    }
}

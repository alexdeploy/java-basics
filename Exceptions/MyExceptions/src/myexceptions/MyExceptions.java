/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexceptions;

import java.util.*;

/**
 *
 * @author alexs
 */
public class MyExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws StringLongException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra de más de 5 caracteres: ");
        try {
            String str = sc.nextLine();
            comprobarString(str);
        } catch (StringLongException e) {
            e.printStackTrace();
        }
    
    }
    
    public static void comprobarNumero(int n) throws RangoException{
    
        if (n >=5 && n < 10) {
            System.out.println("El numero es correcto.");
        } else {
            throw new RangoException(n);
        }
        
    }
    
    public static void comprobarString(String str) throws StringLongException{
    
        if (str.length() > 5) {
            System.out.println("Palabra correcta.");
        } else {
        
            throw new StringLongException(str);
            
        }
        
    }
    
    
    
}

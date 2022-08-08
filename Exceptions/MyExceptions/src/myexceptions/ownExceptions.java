/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexceptions;

/**
 *
 * @author alexs
 */
public class ownExceptions extends Exception{
    
    private int n;
    
    public ownExceptions(int n){
        
        this.n = n;
        
    }
    
    public void prueba(int n){
        n = n + 5;
        System.out.println("Ahora el numero es " + n);
    }
    
    public String toString(){
    
        return "El numero es negativo";
        
    }
    
    
}

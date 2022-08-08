/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_classes_universe;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author alexs
 */
public class abstract_classes_universe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Planetas marte = new Planetas(200000,1000000,true,50,1000,500,275,10);
        Planetas tierra = new Planetas(200000,1000000,true,50,1000,500,275,10);
        
        ArrayList lista = new ArrayList();
        
        lista.add(marte);
        lista.add(tierra);
        
        
        // Muestra los datos con el metodo muestra()
        
        marte.muestra();
        tierra.muestra();
        
        // Ejemplo de instanceof
        
        String tipo = "";
        Iterator it = lista.iterator();
        Astros a = (Astros) it.next();
        
        if (a instanceof Planetas) {
            
            tipo = "Planeta";
            
        }
        
        System.out.println("Marte es un: " + tipo);
        
    }
    
}

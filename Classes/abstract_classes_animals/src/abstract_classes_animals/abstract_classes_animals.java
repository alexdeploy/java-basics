/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_classes_animals;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class abstract_classes_animals {

    /**
     */
    
    public static void main(String[] args) {
        
        // Creo los objetos
        
        Perro perro1 = new Perro("Ayudante de santaclaus",4,"Disponible","2012-10-10","Pastor aleman",true);
        Gato gato1 = new Gato("Bola de nueve",2,"Reservado","2010-9-02","Blanco",true);
        Loro loro1 = new Loro("Pepito",10,"Reservado","2009-5-05",true,true,"Africa",true);
        Canario canario1 = new Canario("Juancho",7,"Disponible","2018-10-11",true,false,"Rusia",true);
        
        // Los añado a el inventario
        
        Inventario inventario = new Inventario();
        
        inventario.lista.add(perro1);
        inventario.lista.add(gato1);
        inventario.lista.add(loro1);
        inventario.lista.add(canario1);
        
        for (int i = 0; i < inventario.lista.size(); i++) {
            inventario.mostrarLista(i);
        }
        
        // Muestro los datos por consola con el método abstracto muestra();
        /*
        perro1.muestra();
        System.out.println("");
        gato1.muestra();
        System.out.println("");
        loro1.muestra();
        System.out.println("");
        canario1.muestra();
        
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Mostrar todos los animales");
        System.out.println("2. Mostrar datos de animal en concreto");
        System.out.println("3. Insertar animal");
        System.out.println("4. Eliminar animal");
        System.out.println("5. Vaciar inventario");
        
        // Inicio Scanner
        
        Scanner sc = new Scanner(System.in);
        
        int op;
        do{
        op = sc.nextInt();
        
        switch(op){
            case 1:
                perro1.muestra();
                break;
            case 2:
                gato1.muestra();
                break;
            case 3:
                inventario.insertarAnimal();
                break;
            case 5:
                break;
                
        }
        } while (op<5);
*/
    }
    
}

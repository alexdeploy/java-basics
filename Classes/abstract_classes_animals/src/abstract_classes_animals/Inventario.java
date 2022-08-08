/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_classes_animals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Inventario {
    
    ArrayList lista = new ArrayList();
    
    public void insertarAnimal(){
        
        /*
        System.out.println("¿Qué animal es?: ");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Loro");
        System.out.println("4. Canario");
        */
        
        Perro perro2 = new Perro("",0,"","","",false);
        lista.add(perro2);
        
        System.out.println("Perro añadido!");
        System.out.println("Introduce los datos.");
        System.out.println("Nombre: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        perro2.setNombre(n);
        System.out.println("Edad: ");
        int i = sc.nextInt();
        perro2.setEdad(i);
        
    }
    
    public void mostrarUnAnimal(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            System.out.println("*** MASCOTA " + indice + " ***");
            Mascotas m = (Mascotas) lista.get(indice);
            m.muestra();
        }
    }
    
    public void mostrarTodosAnimales(){
        for (int i = 0; i < lista.size(); i++) {
            mostrarUnAnimal(i);
            System.out.println("");
        }
    }
    
    public String getTipoMascota(Mascotas a){
        String tipo = "";
        if (a instanceof Perro) {
            tipo = "Perro";
        }else if(a instanceof Gato){
            tipo = "Gato";
        }else if(a instanceof Canario){
            tipo = "Canario";
        }else if(a instanceof Loro){
            tipo = "Loro";
        }
        return tipo;
    }
    
    public void mostrarLista(int indice){
        
        if (indice >= 0 && indice < lista.size()) {
            System.out.println("*** MASCOTA " + indice + " ***");
            Mascotas m = (Mascotas) lista.get(indice);
            System.out.println("Nombre: " + m.getNombre());
            System.out.println("Tipo: " + getTipoMascota(m));
        }
    }
}
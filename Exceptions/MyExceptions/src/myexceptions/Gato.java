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
public class Gato{
    
    private int edad;
    private String nombre;

    public Gato(int edad, String nombre) throws Exception {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad (int edad) throws Exception{
        if (edad<0) {
            throw new Exception("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("El nombre debe ser almenos de 3 letras.");
        }
        this.nombre = nombre;
    }
    
    public void imprimir(){
    
        System.out.println("Nombre: " + this.nombre + " Edad: " + this.edad);
    }
    
        
}

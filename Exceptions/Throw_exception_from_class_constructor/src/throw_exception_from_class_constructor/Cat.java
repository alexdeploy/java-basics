/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throw_exception_from_class_constructor;

/**
 *
 * @author alexruedadev
 */
public class Cat {
    
    private String nombre;
    private int edad;

    public Cat(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        if (edad < 0) {
            throw new Exception ("Error: edad negativa.");
        }else{
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        this.edad = edad;
    }
    
    public void printData(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
    
    
}

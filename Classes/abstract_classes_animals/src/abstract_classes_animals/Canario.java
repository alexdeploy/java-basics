/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_classes_animals;

import java.util.Date;

/**
 *
 * @author alexs
 */
public class Canario extends Aves {
    
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
    // Metodos heredados de Aves
    
    @Override
    public void muestra(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad() + " Años");
        System.out.println("Estado: " + this.getEstado());
        System.out.println("Fecha de nacimiento: " + this.getFechaNacimiento());
        System.out.println("¿Tiene pico?: " + this.isPico());
        System.out.println("¿Vuela?: " + this.isVuela());
        System.out.println("Color: " + this.getColor());
        System.out.println("Canta?: " + this.isCanta());
    };
    
    @Override
    public void habla(){};
    
    @Override
    public void volar(){}
    
    
}

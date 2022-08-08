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
public class Gato extends Mascotas{
    
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    
    // Métodos heredados de Mascotas
    
    @Override
    public void muestra(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad() + " Años");
        System.out.println("Estado: " + this.getEstado());
        System.out.println("Fecha de nacimiento: " + this.getFechaNacimiento());
        System.out.println("Color: " + this.getColor());
        System.out.println("¿Tiene pelo largo?: " + this.isPeloLargo());
    }
    
    @Override
    public void habla(){}
    
    
    
    
    
}

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
public class Loro extends Aves{
    
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    
    
    
    @Override
    public void muestra(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad() + " Años");
        System.out.println("Estado: " + this.getEstado());
        System.out.println("Fecha de nacimiento: " + this.getFechaNacimiento());
        System.out.println("¿Tiene pico?: " + this.isPico());
        System.out.println("¿Vuela?: " + this.isVuela());
        System.out.println("Origen: " + this.getOrigen());
        System.out.println("Habla?: " + this.isHabla());
    }
    
    public void saluda(){}
    
    @Override
    public void volar(){}

    @Override
    public void habla(){
    }
}

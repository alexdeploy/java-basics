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
abstract class Aves extends Mascotas{
    
    private boolean pico;
    private boolean vuela;

    public Aves(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
    abstract void volar();
    
    // Métodos abstractos heredados de Mascotas.
    
    @Override
    abstract void muestra();
    @Override
    abstract void habla();
    
}

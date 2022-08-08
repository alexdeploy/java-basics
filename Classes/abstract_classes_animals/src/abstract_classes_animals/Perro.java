/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_classes_animals;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author alexs
 */
public class Perro extends Mascotas{
    
    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
    
    @Override
    public void muestra(){
        
        System.out.println("Hora de la consulta: " + LocalDate.now());
        
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad() + " Años");
        System.out.println("Estado: " + this.getEstado());
        System.out.println("Fecha de nacimiento: " + this.getFechaNacimiento());
        System.out.println("Raza: " + this.getRaza());
        System.out.print("¿Tiene pulgas?: ");

        if (pulgas) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }        
    }
    
    @Override
    public void habla(){
        System.out.println("GUAU GUAU");
    }
    
}

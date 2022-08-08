/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_classes_universe;

/**
 *
 * @author alexs
 */
public class Planetas extends Astros {
    
    int distanciaSol;
    int orbitaSol;
    boolean tieneSatelites;

    public Planetas(int distanciaSol, int orbitaSol, boolean tieneSatelites, int radioEcuatorial, int rotacionSobreEje, int masa, int temperaturaMedia, int gravedad) {
        super(radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public int getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(int orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }
    
    @Override
    public void muestra(){
        
        System.out.println("Distancia al sol: " + distanciaSol + " Km");
        System.out.println("Órbita al sol: " + orbitaSol + " Km");
        System.out.println("Radio Ecuatorial: " + radioEcuatorial + " Metros");
        System.out.println("Rotación sobre su eje: " + rotacionSobreEje + " Días");
        System.out.println("Masa: " + masa + " Kg");
        System.out.println("Temperatura Media: " + temperaturaMedia + " Grados");
        System.out.println("Gravedad: " + gravedad + " m/s");
        
    };
    
}

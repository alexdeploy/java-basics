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
abstract class Astros {
    
    int radioEcuatorial;
    int rotacionSobreEje;
    int masa;
    int temperaturaMedia;
    int gravedad;

    public Astros(int radioEcuatorial, int rotacionSobreEje, int masa, int temperaturaMedia, int gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreEje = rotacionSobreEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public int getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(int radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public int getRotacionSobreEje() {
        return rotacionSobreEje;
    }

    public void setRotacionSobreEje(int rotacionSobreEje) {
        this.rotacionSobreEje = rotacionSobreEje;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
    
    /**
     * Métodos abstractos
     */
    
    public abstract void muestra();
    
}

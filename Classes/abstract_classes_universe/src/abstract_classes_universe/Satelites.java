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
class Satelites extends Astros {
    
    int distanciaPlaneta;
    int orbitaPlanetaria;
    Planetas planeta;

    public Satelites(int radioEcuatorial, int rotacionSobreEje, int masa, int temperaturaMedia, int gravedad) {
        super(radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
    }
    
    @Override
    public void muestra(){};
    
    
    
    
}

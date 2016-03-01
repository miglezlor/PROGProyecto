package proyectomain;

import datos_pokemon.*;
/**
 *
 * @author mgonzalezlorenzo
 */
public class ProyectoMain {

    
    public static void main(String[] args) {
        Pokedex x = new Pokedex();
        Combate comb = new Combate();
        x.iniciar();
        comb.elegir();
    }
    
}

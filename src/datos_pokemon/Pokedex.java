package datos_pokemon;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo & agomezcastro
 */
public class Pokedex {
    ArrayList <Pokemon> lista = new ArrayList();
    public Pokemon pokemon1;
    public Pokemon pokemon2;
    
    public void iniciar(){
        Pokemon charmander = new Pokemon("Charmander",100, new Movimientos("Arañazo",30));
        Pokemon squirtle = new Pokemon("Squirtle",120,new Movimientos("Placaje",18));
        
        lista.add(charmander);
        lista.add(squirtle);
    }
    
    public void elegir(){
        int opcion;
        int opcion2;
        
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 elige: \n 1. Charmander. \n 2. Squirtle."));
            
            switch(opcion){
                case 1 : pokemon1=lista.get(0); JOptionPane.showMessageDialog(null, "Adelante Charmander !!!!!!!!");
                    break;
                case 2 : pokemon1=lista.get(1); JOptionPane.showMessageDialog(null, "Adelante Squirtle !!!!!!!!");
                    break;
                
            }
            
            opcion2=Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 elige: \n 1. Charmander. \n 2. Squirtle. "));
            
            switch(opcion2){
                case 1 : pokemon2=lista.get(0); JOptionPane.showMessageDialog(null, "Adelante Charmander !!!!!!!!");
                    break;
                case 2 : pokemon2=lista.get(1); JOptionPane.showMessageDialog(null, "Adelante Squirtle !!!!!!!!");
                    break;
                
            }
        
    }
        
    
    
}

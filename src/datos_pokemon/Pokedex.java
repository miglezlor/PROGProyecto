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
        Pokemon charmander = new Pokemon("Charmander",100,"Arañazo");
        Pokemon squirtle = new Pokemon("Squirtle",120,"Placaje");
        
        lista.add(squirtle);
        lista.add(charmander);
        
    }
    
    public void elegir(){
        int opcion;
        
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 elige: \n 1. Charmander. \n 2. Squirtle."));
            
            switch(opcion){
                case 1 : pokemon1=lista.get(opcion-1); JOptionPane.showMessageDialog(null, "Adelante Charmander");
                    break;
                case 2 : pokemon1=lista.get(opcion-1); JOptionPane.showMessageDialog(null, "Adelante Squirtle");
                    break;
                
            }
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 elige: \n 1. Charmander. \n 2. Squirtle. \n 3. Salir"));
            
            switch(opcion){
                case 1 : pokemon2=lista.get(opcion-1); JOptionPane.showMessageDialog(null, "Adelante Charmander");
                    break;
                case 2 : pokemon2=lista.get(opcion-1); JOptionPane.showMessageDialog(null, "Adelante Squirtle");
                    break;
                
            }
        
    }
        
    
    
}

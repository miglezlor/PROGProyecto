package datos_pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author mgonzalezlorenzo & agomezcastro
 */
public class Pokedex {
    ArrayList <Pokemon> lista = new ArrayList();
    
    public void iniciar(){
        lista.add(new Pokemon("Charmander","Ascuas","Arañazo","Corte","Excavar",50));
        lista.add(new Pokemon("Squirtle","Burbuja","Pistola Agua","Placaje","Golpe Roca",50));
        lista.add(new Pokemon("Bulbasaur","Latigo Cepa","Hoja Afilada","Placaje","Corte",50));
        lista.add(new Pokemon("Pikachu","Rayo","Ataque Rapido","Placaje Electrico","Portazo",50));
        lista.add(new Pokemon("Rattata","Placaje","Hip. Colmillo","Arañazo","Golpe Cabeza",50));
        
        File f = new File("pokedex.txt");
        PrintWriter escribir=null;
        try {
            
            escribir = new PrintWriter(f);
            for(int i=0;i<lista.size();i++){
                
                escribir.println(lista.get(i));
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Erro escritura "+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
    
}

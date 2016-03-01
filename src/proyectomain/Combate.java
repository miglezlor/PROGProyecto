package proyectomain;

import datos_pokemon.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author mgonzalezlorenzo
 */
public class Combate {
    
    public void elegir(){
        Scanner sc = null;
        String pok = JOptionPane.showInputDialog("Introduce pokemon deseado: \n Charmander | Squirtle | Bulbasaur | Pikachu | Rattata");
        try {
            File f = new File ("pokedex.txt");
            sc = new Scanner(f);
            while(sc.hasNextLine()){
                String res = sc.nextLine();
                String[]datos = res.split(",");
                if(datos[0].equalsIgnoreCase(pok)){
                    JOptionPane.showMessageDialog(null, "Has elegido a "+datos[0]);
                }        
                }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro no ficheiro1 " + ex.toString());
        }
        finally{
            sc.close();
        }
    }
}

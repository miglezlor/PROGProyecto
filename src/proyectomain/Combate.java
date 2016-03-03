package proyectomain;

import datos_pokemon.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mgonzalezlorenzo
 */
public class Combate {
    
    Pokedex obj = new Pokedex();
    
    public void elegir(){
        
        obj.iniciar();
        obj.elegir();
    }
    
    public void combatir(){
        int vida1=obj.pokemon1.getVida();
        int vida2=obj.pokemon2.getVida();
        int opcion;
        boolean fin=false;
        
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Que debe hacer "+obj.pokemon1.getNombre()+" ? \n 1. "+(obj.pokemon1.getMov1().getNomMov())+" \n 2. "+(obj.pokemon1.getMov2().getNomMov())));
        switch(opcion){
            case 1 : vida2=vida2-obj.pokemon1.getMov1().getDano() ; obj.pokemon2.setVida(vida2); System.out.println(obj.pokemon1.getNombre()+" uso "+obj.pokemon1.getMov1().getNomMov());
                break;
            case 2: vida2=vida2-obj.pokemon1.getMov2().getDano() ; obj.pokemon2.setVida(vida2); System.out.println(obj.pokemon1.getNombre()+" uso "+obj.pokemon1.getMov2().getNomMov());
                break;
        }
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Que debe hacer "+obj.pokemon2.getNombre()+" ? \n 1. "+(obj.pokemon2.getMov1().getNomMov())+"\n 2. "+(obj.pokemon2.getMov2().getNomMov())));
        switch(opcion){
            case 1 : vida1=vida1-obj.pokemon2.getMov1().getDano() ; obj.pokemon1.setVida(vida1); System.out.println(obj.pokemon2.getNombre()+" uso "+obj.pokemon2.getMov1().getNomMov());
                break;
            case 2: vida1=vida1-obj.pokemon2.getMov2().getDano() ; obj.pokemon1.setVida(vida1); System.out.println(obj.pokemon2.getNombre()+" uso "+obj.pokemon2.getMov2().getNomMov());
                break;
        }
        
        System.out.println(obj.pokemon1.getNombre()+" :"+obj.pokemon1.getVida()+" ----------- "+obj.pokemon2.getNombre()+" :"+obj.pokemon2.getVida());
        
        if(vida1<=0 | vida2<=0){
            fin=true;
        }
                
        }while(fin==false);
    }
}

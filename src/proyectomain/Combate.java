package proyectomain;

import datos_pokemon.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void combatir() {
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
            FileWriter fw = null;
            PrintWriter esc = null;
            
            
            if(vida1<=0 && vida2>0){
                JOptionPane.showMessageDialog(null, "Victoria para Jugador 2 con su "+obj.pokemon2.getNombre());
                
                try{
                    fw = new FileWriter("historial.txt",true);
                    esc = new PrintWriter(fw);
                    esc.append("\n");
                    esc.append("Gano el Jugador 2 con "+obj.pokemon2.getNombre());
                } catch (IOException ex) {
                    Logger.getLogger(Combate.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    try {
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Combate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    esc.close();
                }
                
            }
            else if(vida2<=0 && vida1>0){
                
                JOptionPane.showMessageDialog(null, "Victoria para Jugador 1 con su "+obj.pokemon1.getNombre());
                
                try{
                    fw = new FileWriter("historial.txt",true);
                    esc = new PrintWriter(fw);
                    esc.append("\n");
                    esc.append("Gano el Jugador 2 con "+obj.pokemon1.getNombre());
                } catch (IOException ex) {
                    Logger.getLogger(Combate.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    try {
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Combate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    esc.close();
                }
            }
            else{
                
                JOptionPane.showMessageDialog(null, "DOBLE K.O.");
                try{
                    fw = new FileWriter("historial.txt",true);
                    esc = new PrintWriter(fw);
                    esc.append("\n");
                    esc.append(obj.pokemon1.getNombre()+" Y "+obj.pokemon2.getNombre()+" se han matado a la vez");
                } catch (IOException ex) {
                    Logger.getLogger(Combate.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    try {
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Combate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    esc.close();
                }
            }
        
        }
        }while(fin==false);
        }
    }

        
        
        

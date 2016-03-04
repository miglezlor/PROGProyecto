package datos_pokemon;

/**
 *
 *  @author mgonzalezlorenzo & agomezcastro
 */
public class Pokemon {
    private String nombre;
    private int vida;
    private Movimientos mov1,mov2;

    public Pokemon() {
    }

    public Pokemon(String nombre, int vida, Movimientos mov1, Movimientos mov2) {
        this.nombre = nombre;
        this.vida = vida;
        this.mov1 = mov1;
        this.mov2 = mov2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Movimientos getMov1() {
        return mov1;
    }

    public void setMov(Movimientos mov1) {
        this.mov1 = mov1;
    }
    
    public Movimientos getMov2() {
        return mov2;
    }

    public void setMov2(Movimientos mov2) {
        this.mov2 = mov2;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", vida=" + vida + ", mov1=" + mov1 + ", mov2=" + mov2 + '}';
    }
    
    

    
    
    
    
    
    
}

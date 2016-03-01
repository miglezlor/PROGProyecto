package datos_pokemon;

/**
 *
 * @author mgonzalezlorenzo & agomezcastro
 */
public class Pokemon {
    private String nombre, mov1, mov2, mov3, mov4;
    private int vida;

    public Pokemon() {
    }

    public Pokemon(String nombre, String mov1, String mov2, String mov3, String mov4, int vida) {
        this.nombre = nombre;
        this.mov1 = mov1;
        this.mov2 = mov2;
        this.mov3 = mov3;
        this.mov4 = mov4;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMov1() {
        return mov1;
    }

    public void setMov1(String mov1) {
        this.mov1 = mov1;
    }

    public String getMov2() {
        return mov2;
    }

    public void setMov2(String mov2) {
        this.mov2 = mov2;
    }

    public String getMov3() {
        return mov3;
    }

    public void setMov3(String mov3) {
        this.mov3 = mov3;
    }

    public String getMov4() {
        return mov4;
    }

    public void setMov4(String mov4) {
        this.mov4 = mov4;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", mov1=" + mov1 + ", mov2=" + mov2 + ", mov3=" + mov3 + ", mov4=" + mov4 + ", vida=" + vida + '}';
    }
    
    
    
}

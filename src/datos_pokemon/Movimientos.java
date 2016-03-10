package datos_pokemon;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Movimientos {
    
    private String nomMov;
    private int dano;
    private Tipos tipmov;

    public Movimientos() {
    }

    public Movimientos(String nomMov, int dano, Tipos tipmov) {
        this.nomMov = nomMov;
        this.dano = dano;
        this.tipmov = tipmov;
    }

    public String getNomMov() {
        return nomMov;
    }

    public void setNomMov(String nomMov) {
        this.nomMov = nomMov;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Tipos getTipmov() {
        return tipmov;
    }

    public void setTipmov(Tipos tipmov) {
        this.tipmov = tipmov;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "nomMov=" + nomMov + ", dano=" + dano + ", tipmov=" + tipmov + '}';
    }
    
    

    
}

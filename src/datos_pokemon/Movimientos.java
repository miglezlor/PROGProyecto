package datos_pokemon;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Movimientos {
    
    private String nomMov;
    private int dano;

    public Movimientos() {
    }

    public Movimientos(String nomMov, int dano) {
        this.nomMov = nomMov;
        this.dano = dano;    
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

    @Override
    public String toString() {
        return "Movimientos{" + "nomMov=" + nomMov + ", dano=" + dano + '}';
    }

    
}

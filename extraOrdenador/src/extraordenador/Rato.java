
package extraordenador;

public class Rato {
    private String modelo;
    
    public boolean inalambrico;

    public Rato() {
    }

    public Rato(String modelo, boolean inalambrico) {
        this.modelo = modelo;
        this.inalambrico = inalambrico;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    @Override
    public String toString() {
        return "Rato{" + "modelo=" + modelo + ", inalambrico=" + inalambrico + '}';
    }
    }

    


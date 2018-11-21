
package extraordenador;

public class Rato {
    private String modelo;
    private int tener;
    
    public boolean serInalambrico(){
      boolean inalambrico;
         if (tener == 1) {
             inalambrico= true;
         } else {
             inalambrico= false;
    } return inalambrico;
    }

    public Rato() {
    }

    public Rato(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Rato{" + "modelo=" + modelo +'}';
    }
    }

    



package extraordenador;

public class Cpu {
    private int nucleos;
    private int ram;

    public Cpu() {
    }

    public Cpu(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Cpu{" + "nucleos=" + nucleos + ", ram=" + ram + '}';
    }
}

package AppVentaComputadoras.Model;

public class Monitor {
    private final int idMotor;
    private String marca;
    private double tamanio;
    private static int contadorMotores = 0;

    private Monitor() {
        this.idMotor = ++contadorMotores;
    }
    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMotor=" + idMotor +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }

    public int getIdMotor() {
        return idMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}

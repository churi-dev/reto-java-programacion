package AppVentaComputadoras_24.Model;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones = 0;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                '}' + super.toString();
    }

    public int getIdRaton() {
        return idRaton;
    }
}

package AppVentaComputadoras_24.Service;

import AppVentaComputadoras_24.Model.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrden = 0;

    public Orden() {
        this.computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrden;
    }

    public void AgregarComputadora(Computadora computadora) {
        computadoras.add(computadora);
    }

    public void MostrarOrden() {
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total de computadoras: " + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);
    }
}

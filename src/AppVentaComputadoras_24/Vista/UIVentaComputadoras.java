package AppVentaComputadoras_24.Vista;

import AppVentaComputadoras_24.Model.Computadora;
import AppVentaComputadoras_24.Model.Monitor;
import AppVentaComputadoras_24.Model.Raton;
import AppVentaComputadoras_24.Model.Teclado;
import AppVentaComputadoras_24.Service.Orden;

public class UIVentaComputadoras {
    public static void main(String[] args) {

        var rato1 = new Raton("usb", "Dell");

        var teclado1 = new Teclado("usb", "Dell");

        var monitor1 = new Monitor("Dell", 40);

        var computadora1 = new Computadora("Computadora 1", monitor1, teclado1, rato1);

        // creamos una orden 1
        var orden1 = new Orden();
        orden1.AgregarComputadora(computadora1);
        orden1.MostrarOrden();
    }
}

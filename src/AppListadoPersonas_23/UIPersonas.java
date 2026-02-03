package AppListadoPersonas_23;

import java.util.Scanner;

public class UIPersonas {

    private static final LogicPersona LogicPersona = new LogicPersona();

    public static void main(String[] args) {
        AppPersona();
    }

    public static void MenuPersona() {
        String menu = """
                **** Listado Personas ***
                1. Agregar 
                2. Listar
                3. Salir
                Proporciona opcion?: 
                """;
        System.out.print(menu);
    }

    public static void AppPersona() {
        var teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                MenuPersona();
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1 -> {
                        AgregarPersona(teclado);
                    }
                    case 2 -> {
                        LogicPersona.ListarPersonas();
                    }
                    case 3 -> {
                        System.out.println("Cerrando listado personas...");
                    }
                    default -> {
                        System.out.println("Opcion no valida");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un valor numerico.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 3);
        teclado.close();
    }

    private static void AgregarPersona(Scanner teclado) {
        System.out.println("Nombre: ");
        var nombre = teclado.nextLine();
        System.out.println("Telefono: ");
        var telefono = Integer.parseInt(teclado.nextLine());
        System.out.println("Correo: ");
        var correo = teclado.nextLine();
        var persona = new Persona(nombre, telefono, correo);
        LogicPersona.AgregarPersona(persona);
        System.out.println("La lista tiene: " + Persona.numero_personas + " elementos.");
    }
}

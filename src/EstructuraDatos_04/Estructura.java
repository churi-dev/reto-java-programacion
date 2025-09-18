package EstructuraDatos_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Estructura {

    static List<Contacto> listarContactos = new ArrayList<>();

    public static void main(String[] args) {
        ApplicationContacto();
    }

    static void Arreglos() {
        // enteros, string, etc
        int [] numeros = new int[10]; // debemos especificar el tamaño

        // definir e inicializar con valor
        String[] nombres = {"Juan", "David", "Leo"};

        // acceder por indice:
        System.out.println(nombres[0]); // Juan

        // metodos | longitud
        System.out.println(nombres.length); // tamanio del arreglo

        // ordenar
        Arrays.sort(nombres);
        for (String nombre: nombres) {
            System.out.println(nombre);
        }
    }

    static void Listas() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("David");
        nombres.add(2, "Leo"); // insertar indicando indice
        // eliminar por objeto
        nombres.remove("Juan");
        // verificar si contiene un valor
        System.out.println(nombres.contains("David")); // retorna un booleano

        // remplazar un valor
        nombres.set(1, "David actualizado");
    }

    static void ApplicationContacto() {
        try {
            var scanner = new Scanner(System.in);
            int opcion;
            do {
                Menu();
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        registroContacto();
                        break;
                    case 2:
                        BuscarContacto();
                        break;
                    case 3:
                        ActualizarContacto();
                        break;
                    case 4:
                        EliminarContacto();
                        break;
                    case 5:
                        ListarContactos();
                        break;
                    case 6:
                        System.out.println("Cerrando sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 6);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    static void Menu() {
        String menu = "1. Registrar contacto\n" +
                "2. Buscar contacto\n" +
                "3. Actualizar contacto\n" +
                "4. Eliminar contaco\n" +
                "5. Listar contactos\n" +
                "6. Salir\n" +
                "Selecciona opción: ";
        System.out.print(menu);
    }

    static void registroContacto() {
        System.out.print("Ingrese el nombre: ");
        var nombre = new Scanner(System.in).nextLine();

        System.out.print("Ingrese el telefono: ");
        var telefono = new Scanner(System.in).nextInt();
        var nuevoRegistro = new Contacto(nombre, telefono);
        listarContactos.add(nuevoRegistro);
        System.out.println("Contacto registrado." + nuevoRegistro.toString());
    }
    static void BuscarContacto() {
        System.out.println("Ingrese nombre contacto: ");
        var nombre = new Scanner(System.in).nextLine();

        var encontrado = listarContactos.stream().filter((p) -> p.nombre.equals(nombre)).findAny().orElse(null);

        if (encontrado != null) {
            System.out.println("Contacto encontrado.");
            System.out.println(encontrado.toString());
        }
    }
    static void  ListarContactos() {
        for (Contacto contacto: listarContactos) {
            System.out.println(contacto.toString());
        }
    }
    static void ActualizarContacto() {
        System.out.println("Ingrese el id para actualizar contacto: ");
        var id = new Scanner(System.in).nextInt();
        var encontrado = listarContactos.stream().filter((c) -> c.getId() == id).findFirst().orElse(null);
        if (encontrado != null) {
            System.out.println("Ingrese nombre contacto: ");
            var nombre = new Scanner(System.in).nextLine();
            System.out.println("Ingrese telefono contacto: ");
            var telefono = new Scanner(System.in).nextInt();
            encontrado.setNombre(nombre);
            encontrado.setTelefono(telefono);
            System.out.println("Contacto actualizado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }

    }
    static void EliminarContacto() {
        System.out.println("Ingrese el id para eliminar contacto: ");
        var id = new Scanner(System.in).nextInt();
        var encontrado = listarContactos.stream().filter((c) -> c.getId() == id).findFirst().orElse(null);
        listarContactos.remove(encontrado);
        System.out.println("Contacto eliminado.");
    }

}

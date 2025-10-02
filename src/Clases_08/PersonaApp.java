package Clases_08;

public class PersonaApp {
    public static void main(String[] args) {
        // instanciamos la clase para crear objetos de clase Persona

        var persona1 = new Persona("Jhon", 20);
        var persona2 = new Persona("Juan", 40);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}

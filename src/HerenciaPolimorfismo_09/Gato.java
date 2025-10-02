package HerenciaPolimorfismo_09;

public class Gato extends Animal {

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad, color);
    }

    public void Sonido() {
        System.out.println("Soy el gato: " + this.getNombre() +  " y hago: Miau! Miau!");
    }

    public static void main(String[] args) {
        // objeto perro
        var perro1 = new Perro("Doki", 4, "Negro");
        System.out.println(perro1.toString());
        perro1.Sonido();
        // objeto gato
        var gato1 = new Gato("Miñi", 2, "Blanco");
        System.out.println(gato1.toString());
        gato1.Sonido();
    }
}

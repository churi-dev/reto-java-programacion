package HerenciaPolimorfismo_09;

public class Perro extends Animal {
    public Perro(String nombre, int edad, String color ) {
        super(nombre, edad, color);
    }

    public void Sonido() {
        System.out.println("Soy el perro: " + this.getNombre() +   " y hago: Gua! Gua! Gua! Gua!");
    }
}

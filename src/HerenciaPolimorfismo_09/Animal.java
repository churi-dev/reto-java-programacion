package HerenciaPolimorfismo_09;

// herencia: es cuando un clase padre tiene una subclase que hereda sus metodos y prppiedades
public class Animal {
    private String nombre;
    private int edad;
    private String color;

    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public void Sonido() {
        System.out.println("Sonido animal");
    };

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

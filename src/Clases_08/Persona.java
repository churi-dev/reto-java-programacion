package Clases_08;

// clase: molde que contiene propiedades y metodos, y traves de ella se crean objetos
public class Persona {
    // propiedades con modificadores
    // public => Llamando la clase se accede por los demas
    // private => solo la clase misma
    // protected => misma clase y subclases ( hijos)
    public String nombre;
    public int edad;


    // contructor => permite instanciar para crear objetos
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    // metodos

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    // metodos
    // GET => Obtener valor de las propiedades
    // SET => actualizar propiedades


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
}

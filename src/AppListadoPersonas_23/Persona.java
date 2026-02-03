package AppListadoPersonas_23;

public class Persona {
    private int id;
    private String nombre;
    private int telefono;
    private String email;

    public static int numero_personas = 0;

    public Persona(String nombre, int telefono, String email) {
        this.id = ++numero_personas;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + ". " + nombre + ", Tel. " + telefono + ", Email. " + email;
    }

    // METHODS SET Y GET
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package AppListadoPersonas_23;

import java.util.ArrayList;
import java.util.List;

public class LogicPersona {

    private static final List<Persona> personas = new ArrayList<>();

    public void AgregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void ListarPersonas() {
        if (!personas.isEmpty()) {
            for (Persona persona : personas ) {
                System.out.println(persona.toString());
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }
}

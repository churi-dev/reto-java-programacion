package ChallengeAdventCalender2025;

public class LucesNavidad {
    /*
    Reto 1: Estado de las Luces de Navidad 💡

    Los duendes de Santa Claus han instalado un sistema de control para las luces del Polo Norte. Necesitan una función rápida que les diga si las luces están activas para la gran noche. Las luces se consideran activas si están encendidas (ON) o si están parpadeando (BLINK).

    Tu objetivo es escribir una función areLightsOn que reciba el estado de las luces como una cadena de texto (status) y devuelva un booleano (true o false) que indique si las luces están activas.
     */
    public static void main(String[] args) {
        System.out.println(areLigthsOn("OFF"));
    }

    static boolean areLigthsOn(String status) {
        boolean isTrue = false;
        if (status.equals("ON") || status.equals("BLINK")) {
            isTrue = true;
        }
        return  isTrue;

    }
}

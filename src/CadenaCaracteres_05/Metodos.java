package CadenaCaracteres_05;

public class Metodos {
    public static void main(String[] args) {
        MetodoString();
    }

    static void MetodoString() {
        String miNombre = "Jhon Churivanti";

        // longirud de cadena
        System.out.println(miNombre.length());

        // mayuscuala
        System.out.println(miNombre.toUpperCase());
        // minuscula
        System.out.println(miNombre.toLowerCase());

        // posicion de un valor por indice
        var valorIndice = miNombre.indexOf("Churivanti");
        System.out.println(valorIndice);

        // acceder a un caracter especifico de un valor almacenado
        System.out.println(miNombre.charAt(0));

        // comparas valores string usando equals()
        var nombre = "Jhon Churivanti";
        var nombre2 = " Churivanti";

        System.out.println(miNombre.equals(miNombre)); // boolean

        // remover espacios de un valor
        System.out.println(" [" + nombre2.trim() + "]");
        
        System.out.println(" [" + nombre2.trim() + "]");
    }


}

package Funciones_Alcance_03;

public class FuncionesAlcance {

    // variable de alcance global
    final String API_KEY = "https://dev-users.herokuapp.com/";

    public static void main(String[] args) {
        // variablde de alcance local
        String miNombre = "Jhon Churivanti";

        /*
        Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
        * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
        *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
        *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
        *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
        *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
         */
        System.out.println(Extra("Jhon", "Churivanti"));
    }

    static int Extra(String texto, String texto2) {
        int contador = 0;
        for (int index = 1; index <= 100; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                System.out.println(texto + " " + texto2);
            } else if (index % 3 == 0) {
                System.out.println(texto);
            } else if (index % 5 == 0) {
                System.out.println(texto2);
            } else {
                System.out.println(index);
                contador++;
            }
        }

        return contador;
    }
}

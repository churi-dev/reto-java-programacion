//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numeros = {10, 4, 5, 5, -4, 20, 100};
        int [] lista =   mayorYmeno(numeros);

        for (int i : lista) {
            System.out.println("Numeros: " + i);
        }
    }

    static int [] mayorYmeno(int[] numeros) {

        int [] mayores;

        mayores = new int [2];

        int mayor = 0;
        int menor = numeros[0];

        for (int index = 0; index < numeros.length; index++) {
            if (numeros[index] > mayor) {
                mayor = numeros[index];
                mayores[0] = mayor;
            }

            if (numeros[index] < menor) {
                menor = numeros[index];
                mayores[1] = menor;
            }
        }
        return mayores;
    }
}
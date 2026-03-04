package Arreglos_29;

public class Vehiculo {

    

    public static void main(String[] args) {
        var newBicicleta1 = new Bicicleta();
        //newBicicleta1.encenderMotor(); // mal, una bicicleta no tiene motor

        var bus1 = new Bus();
        bus1.encenderMotor();
    }
}

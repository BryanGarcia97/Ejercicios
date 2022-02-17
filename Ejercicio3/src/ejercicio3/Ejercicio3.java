package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numeroEmpleados;

        float[] sueldos;

        float sueldoIngresado;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados a ingresar sueldos: ");
        numeroEmpleados = leer.nextInt();

        sueldos = new float[numeroEmpleados];

        for (int i = 0; i < numeroEmpleados; i++) {

            System.out.println("Ingrese sueldo de empleado " + (i + 1) + ": ");

            sueldoIngresado = leer.nextFloat();

            if (sueldoIngresado < 0) {

                do {
                    System.out.println("No se permiten valores negativos ingrese de nuevo el sueldo: ");
                    sueldoIngresado = leer.nextFloat();
                } while (sueldoIngresado < 0);
            }

            sueldos[i] = sueldoIngresado;
        }
        int contador = 1;

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("sueldo del empleado " + (i + 1) + ": " + sueldos[i]);
        }
    }

}

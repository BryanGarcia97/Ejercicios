package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        float nota = (float) 0.00;

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");

        nota = leer.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else if (nota >= 6.50 && nota <= 6.99) {
            System.out.println("Usted tiene la posibilidad de realizar un examen de sificiencia para aprobar");
        } else {
            System.out.println("Reprobado");
        }
    }

}
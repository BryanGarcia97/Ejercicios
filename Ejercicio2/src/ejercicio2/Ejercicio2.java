package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        float compra, total;
        int bolita;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra: ");
        compra = leer.nextFloat();
        System.out.println("Elija la bolita roja=1, verde=2, blanca=3: ");
        bolita = leer.nextInt();
        
        switch (bolita) {
            case 1:
                total = (float) (compra - (compra * 0.10));
                System.out.println("Aplicando un descuento del 10%, su nuevo total a pagar es de: " + total);
                System.out.println("Feliz Día");
                break;
            case 2:
                total = (float) (compra - (compra * 0.05));
                System.out.println("Aplicando un descuento del 5%, su nuevo total a pagar es de: " + total);
                System.out.println("Feliz Día");
                break;
            default:
                System.out.println("No aplica para un descuento, gracias por participar :)");
                break;
        }

    }

}
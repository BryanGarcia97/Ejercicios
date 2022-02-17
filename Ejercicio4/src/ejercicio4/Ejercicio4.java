package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int cantidadNumeros;
        int numeroMayor = 0; 
        int numeroMenor = 0; 
        int cantidadPares = 0; 
        int numero;

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuantos numeros desea ingresar?, escriba su cantidad:");
        cantidadNumeros = leer.nextInt();
  
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el numero: ");
            numero = leer.nextInt();

            
            if (numero < 0) {
                System.out.println("No se permiten numeros negativos");
                return;
            }

            if (numero > numeroMayor || numeroMayor == 0) {
                numeroMayor = numero;
            }

            if (numero < numeroMenor || numeroMenor == 0) {
                numeroMenor = numero;
            }
                        
            if (numero % 2 == 0) {
                
                cantidadPares++;
            }
        }
        
        System.out.println("Numero Mayor: " + numeroMayor);
        System.out.println("Numero menor: " + numeroMenor);
        System.out.println("Numero Cantidad Pares: " + cantidadPares);

    }

}
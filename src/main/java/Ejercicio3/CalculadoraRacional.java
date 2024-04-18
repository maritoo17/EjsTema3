package Ejercicio3;

import java.util.Scanner;

public class CalculadoraRacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(2, 4);

        while (true) {
            System.out.println("\nOperaciones con Números Racionales");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Simplificar r2 (2/4)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + r1.sumar(r2));
                    break;
                case 2:
                    System.out.println("Resultado de la multiplicación: " + r1.multiplicar(r2));
                    break;
                case 3:
                    r2.simplificarPublico();
                    System.out.println("r2 simplificado: " + r2);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}

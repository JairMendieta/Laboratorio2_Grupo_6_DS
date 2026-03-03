import java.util.Scanner;

public class MarcadorDePuntos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int points = 0;
        int option = 0; 

        do {
            System.out.println("--- Menú Marcador de Puntos ---");
            System.out.println("1. Sumar puntos");
            System.out.println("2. Restar puntos");
            System.out.println("3. Ver marcador");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: "); 

            try {
                option = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.\n");
                scanner.next();  
                option = 0;
                continue;  
            }

            switch (option) {
                case 1: 
                    System.out.print("¿Cuántos puntos quieres sumar? ");
                    int amountSum = scanner.nextInt();
                    points += amountSum; 
                    System.out.println("¡Puntos sumados correctamente!\n");
                    break; 

                case 2:
                    System.out.print("¿Cuántos puntos quieres restar? ");
                    int amountSubtraction = scanner.nextInt();
                    points -= amountSubtraction; 
                    System.out.println("¡Puntos restados correctamente!\n");
                    break;

                case 3: 
                    System.out.println("---------------------------");
                    System.out.println("  Puntuación Actual: " + points);
                    System.out.println("---------------------------\n");
                    break;

                case 4: 
                    System.out.println("Saliendo del programa. ¡Adiós!\n");
                    break;

                default: 
                    if (option != 0) { 
                        System.out.println("Opción no válida. Por favor, elige un número del 1 al 4.\n");
                    }
                    break;
            }

        
        } while (option != 4);
        
        
        scanner.close();
    }
}
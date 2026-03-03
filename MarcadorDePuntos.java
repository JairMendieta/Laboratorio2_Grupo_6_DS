import java.util.Scanner;

public class MarcadorDePuntos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int puntos = 0;
        int opcion = 0; 

        do {
            System.out.println("--- Menú Marcador de Puntos ---");
            System.out.println("1. Sumar puntos");
            System.out.println("2. Restar puntos");
            System.out.println("3. Ver marcador");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: "); 

            try {
                opcion = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.\n");
                scanner.next();  
                opcion = 0;
                continue;  
            }

            switch (opcion) {
                case 1: 
                    System.out.print("¿Cuántos puntos quieres sumar? ");
                    int cantidadSuma = scanner.nextInt();
                    puntos += cantidadSuma; 
                    System.out.println("¡Puntos sumados correctamente!\n");
                    break; 

                case 2:
                    System.out.print("¿Cuántos puntos quieres restar? ");
                    int cantidadResta = scanner.nextInt();
                    puntos -= cantidadResta; 
                    System.out.println("¡Puntos restados correctamente!\n");
                    break;

                case 3: 
                    System.out.println("---------------------------");
                    System.out.println("  Puntuación Actual: " + puntos);
                    System.out.println("---------------------------\n");
                    break;

                case 4: 
                    System.out.println("Saliendo del programa. ¡Adiós!\n");
                    break;

                default: 
                    if (opcion != 0) { 
                        System.out.println("Opción no válida. Por favor, elige un número del 1 al 4.\n");
                    }
                    break;
            }

        
        } while (opcion != 4);
        
        
        scanner.close();
    }
}
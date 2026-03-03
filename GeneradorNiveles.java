import java.util.Scanner;

public class GeneradorNiveles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level;

        do {
            System.out.println("=== Generador de Niveles ===");
            System.out.println("1. Nivel 1: Bloque Sólido");
            System.out.println("2. Nivel 2: Caja Vacía (Bordes)");
            System.out.println("3. Nivel 3: Patrón de Ajedrez");
            System.out.println("4. Salir");
            System.out.print("Elige un nivel: ");
            
            level = scanner.nextInt();

            if (level >= 1 && level <= 3) {
                System.out.print("Introduce el ancho del mapa: ");
                int width = scanner.nextInt();
                System.out.print("Introduce el alto del mapa: ");
                int height = scanner.nextInt();

                System.out.println("\n--- Mapa Generado ---");

                switch (level) {
                    case 1:
                        // Nivel 1: Bloque Sólido (*)
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        // Nivel 2: Caja Vacía (Bordes con *, relleno con espacio)
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        // Nivel 3: Patrón de Ajedrez (* y un espacio/bloque)
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                if ((i + j) % 2 == 0) {
                                    System.out.print("*");
                                } else {
                                    System.out.print("-"); // Puedes usar 'O', '-' o espacio según prefieras
                                }
                            }
                            System.out.println();
                        }
                        break;
                }
                System.out.println("---------------------\n");
            } else if (level != 4) {
                System.out.println("Opción no válida. Inténtalo de nuevo.\n");
            }

        } while (level != 4);

        System.out.println("¡Gracias por usar el Generador de Niveles!");
        scanner.close();
    }
}

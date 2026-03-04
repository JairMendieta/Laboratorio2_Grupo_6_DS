import java.util.Random;
import java.util.Scanner;

public class BattleSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al Simulador de Batalla! ");
        int lifeEnemy = 100;
        int enemyDefense = 5;
        int physicalPower = 20;
        int magicalPower = 25;
        int damage = 0;
        int round = 1;

        while (round <= 5) {
            System.out.println("\n--- Ronda " + round + " ---");
            
            System.out.print("Elige tu ataque (1 = Físico, 2 = Mágico): ");
            int eleccion = scanner.nextInt();

            if (eleccion == 1) {
                damage = physicalPower - enemyDefense;
                System.out.println("Usaste Ataque Físico.");
            } else if (eleccion == 2) {
                damage = magicalPower;
                System.out.println("Usaste Ataque Mágico.");
            } else {
                System.out.println("Opción inválida. Pierdes tu turno.");
                continue; 
            }

            int probabilidadCritico = random.nextInt(10) + 1; 

            if (probabilidadCritico <= 2 && damage > 0) {
                damage = damage * 2; 
                System.out.println("¡GOLPE CRÍTICO!");
            }

            if (damage < 0) {
                damage = 0;
            }
            lifeEnemy = lifeEnemy - damage;
            System.out.println("Le hiciste " +  damage + " de daño al enemigo.");
            
            if (lifeEnemy <= 0) {
                System.out.println("Vida del enemigo: 0");
                System.out.println("\n¡Has derrotado al enemigo en " + round + " rondas!");
                break; 
            } else {
                System.out.println("Vida del enemigo restante: " + lifeEnemy);
            }
        }

        if (lifeEnemy > 0) {
            System.out.println("\nSe acabaron las 5 rondas. ¡El enemigo sobrevivió!");
        }

        scanner.close();
    }
}

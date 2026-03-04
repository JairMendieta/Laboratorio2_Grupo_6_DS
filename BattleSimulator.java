import java.util.Random;
import java.util.Scanner;

public class BattleSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lifePlayer = 100;
        int defensePlayer = 5;
        int lifeEnemy = 100;
        int defensePhysicalEnemy = 5;
        int defenseMagicalEnemy = 2;

        int round = 1;

        System.out.println("¡Empieza la batalla! Tu y el enemigo tenéis 100 de vida.");

        while (lifePlayer > 0 && lifeEnemy > 0) {
            System.out.println("\n--- Ronda " + round + " ---");
            System.out.print("Elige ataque (1 = Fisico, 2 = Magico): ");
            String eleccion = scanner.next();

            int damagePlayer = 0;

            if (eleccion.equals("1")) {
                int poderFisico = random.nextInt(15) + 10;
                damagePlayer = poderFisico - defensePhysicalEnemy;
                System.out.println("Usaste Ataque Fisico.");
            } else if (eleccion.equals("2")) {
                int poderMagico = random.nextInt(20) + 15;
                damagePlayer = poderMagico - defenseMagicalEnemy;
                System.out.println("Usaste Ataque Magico.");
            } else {
                System.out.println("Opcion invalida. Pierdes el turno.");
            }

            if (damagePlayer < 0)
                damagePlayer = 0;
            if (damagePlayer > 0 && random.nextInt(100) < 15) {
                damagePlayer *= 2;
                System.out.println("¡GOLPE CRITICO!");
            }

            lifeEnemy -= damagePlayer;
            System.out.println("Le hiciste " + damagePlayer + " de daño. Vida del enemigo: " + Math.max(0, lifeEnemy));

            if (lifeEnemy <= 0) {
                System.out.println("¡Has derrotado al enemigo en " + round + " rondas!");
                break;
            }

            int enemyPower = random.nextInt(11) + 10;
            int damageEnemy = enemyPower - defensePlayer;

            if (damageEnemy < 0)
                damageEnemy = 0;

            if (damageEnemy > 0 && random.nextInt(100) < 10) {
                damageEnemy *= 2;
                System.out.println("¡El enemigo te hizo un GOLPE CRITICO!");
            }
            lifePlayer -= damageEnemy;
            System.out
                    .println("El enemigo te hizo " + damageEnemy + " de daño. Tu vida: " + Math.max(0, lifePlayer));

            if (lifePlayer <= 0) {
                System.out.println("Has sido derrotado en " + round + " rondas.");
                break;
            }

            round++;
        }

        scanner.close();
    }
}

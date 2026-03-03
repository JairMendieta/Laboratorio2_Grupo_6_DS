package Laboratorio2_Grupo_6_DS;


import java.util.Scanner;

public class MysteryNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 50) + 1;
        int userGuess;
        int attemptCounter = 0;
        boolean isGuessed = false;

        // Generar número aleatorio del 1 al 50
        secretNumber = (int)(Math.random() * 50) + 1;

        System.out.println("🎮 BIENVENIDO AL JUEGO ADIVINA EL NÚMERO 🎮");
        System.out.println("Estoy pensando en un número del 1 al 50...");

        while (!isGuessed) {
            System.out.print("Ingresa tu número: ");
            userGuess = sc.nextInt();

            attemptCounter++;
            if (userGuess == secretNumber) {
                System.out.println("🎉 ¡Felicidades! Adivinaste el número en " + attemptCounter + " intentos.");
                System.out.println("total de intentos: "+attemptCounter);
                isGuessed = true;
            } 
            else if (userGuess < secretNumber) {
                System.out.println("🔼 El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("🔽 El número es menor. Intenta de nuevo.");
            }
        } 
        sc.close();
    }
}

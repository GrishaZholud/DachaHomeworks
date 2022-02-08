package zholud.homeworks.GameGuessNumber;


import java.util.Scanner;

public class GameGuessNumber {
    private static Scanner enterNumber = new Scanner(System.in);
    private static int userNumber;
    private static int attempts = 0;

    protected static void game() {
        int hiddenNumber = (int) Math.round(Math.random() * 100) + 1;
        System.out.println("Угадай число");
        while (attempts < 10) {
            userNumber = enterNumber.nextInt();
            if (userNumber == hiddenNumber) {
                System.out.println("Вы угадали число! Загаданное число равно " + hiddenNumber);
                return;
            }
            if (userNumber >= hiddenNumber) {
                System.out.println("Загаданное число меньше");
            }
            if (userNumber <= hiddenNumber) {
                System.out.println("Загаданное число больше");
            }
            attempts++;
        }
        System.out.println("\nУ вас закончились попытки, загаданное число равно " + hiddenNumber);
    }
}

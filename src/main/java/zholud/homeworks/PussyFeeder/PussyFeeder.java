package zholud.homeworks.PussyFeeder;

import java.util.Scanner;

public class PussyFeeder {
    private static final int maxCountFood = 7;
    private static final int minCountFood = 0;
    private static int leftoverFood = 0;
    private static Scanner numberFromMenu = new Scanner(System.in);
    private static int foodCount;
    private static String input;
    private static String[] cats = {
            "Alex", "Barney", "Cliff", "Dave", "Copper", "Bart", "Jey", "Ben"
    };
    private static int[] food = {
            5, 6, 7, 4, 3, 2, 5, 4
    };

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            showMenu();
            switch (numberFromMenu.next()) {
                case "1":
                    feedOneCat();
                    printAllCatsAndFood();
                    break;
                case "2":
                    feedAllCats();
                    printAllCatsAndFood();
                    break;
                case "3":
                    feedEvenCats();
                    printAllCatsAndFood();
                    break;
                case "4":
                    feedOdderCats();
                    printAllCatsAndFood();
                    break;
                case "666":
                    return;
            }
        }
    }

    public static void feedOneCat() {
        System.out.println("Какого кота накормить?");
        input = numberFromMenu.next();
        if (!validatePlayersInput(input)) {
            return;
        }
        if (!checkingBoundsOfArray(input)) {
            return;
        }
        int numberCats = Integer.parseInt(input);
        System.out.println("Сколько еды нужно добавить (убавить)?\n Если вы хотите убавить еду, напишите количество еды со знаком минус");
        input = numberFromMenu.next();
        if (!validatePlayersInput(input)) {
            return;
        }
        foodCount = Integer.parseInt(input);
        checkAcceptableFood(foodCount, numberCats - 1);
    }


    public static void feedAllCats() {
        System.out.println("Cколько еды нужно добавить (убавить)?\n Если вы хотите убавить еду, напишите количество еды со знаком минус");
        input = numberFromMenu.next();
        if (!validatePlayersInput(input)) {
            return;
        }
        foodCount = Integer.parseInt(input);
        for (int i = 0; i < food.length; i++) {
            checkAcceptableFood(foodCount, i);
        }
    }

    public static void feedEvenCats() {
        System.out.println("Cколько еды нужно добавить (убавить)?\n Если вы хотите убавить еду, напишите количество еды со знаком минус");
        input = numberFromMenu.next();
        if (!validatePlayersInput(input)) {
            return;
        }
        foodCount = Integer.parseInt(input);
        for (int i = 1; i < food.length; i += 2) {
            checkAcceptableFood(foodCount, i);
        }
    }

    public static void feedOdderCats() {
        System.out.println("Cколько еды нужно добавить (убавить)?\n Если вы хотите убавить еду, напишите количество еды со знаком минус");
        input = numberFromMenu.next();
        if (!validatePlayersInput(input)) {
            return;
        }
        foodCount = Integer.parseInt(input);
        for (int i = 0; i < food.length - 1; i += 2) {
            checkAcceptableFood(foodCount, i);
        }
    }

    public static void printAllCatsAndFood() {
        for (int i = 0; i < food.length; i++) {
            System.out.println(cats[i] + ": " + food[i]);
        }
    }

    private static void checkAcceptableFood(int foodCount, int i) {
        if (food[i] + foodCount > maxCountFood) {
            System.out.println("У кота " + cats[i] + " полная миска");
            leftoverFood = food[i] + foodCount - maxCountFood;
            food[i] = maxCountFood;
            System.out.println("Коту " + cats[i] + " не удалось положить " + leftoverFood + " пакетиков еды");
            return;
        }
        if (food[i] + foodCount < 0) {
            System.out.println("У кота " + cats[i] + " слишком мало еды");
            leftoverFood = -foodCount - food[i];
            food[i] = minCountFood;
            System.out.println("Коту " + cats[i] + " не удалось положить " + leftoverFood + " пакетиков еды");
            return;
        }
        food[i] += foodCount;

    }


    public static void showMenu() {
        System.out.println("Выберите нужную цифру \n" +
                "Меню: \n" +
                "1 - Накормить одного кота \n" +
                "2 - Накормить всех котов \n" +
                "3 - Накормить чётных котов \n" +
                "4 - Накормить нечетных котов \n" +
                "666 - Выйти из меню");
    }

    private static boolean validatePlayersInput(String input) {
        if (input.matches("\\D+")) {
            System.out.println("Введён недопустимый символ");
            showMenu();
            return false;
        }
        return true;
    }

    private static boolean checkingBoundsOfArray(String input) {
        if (Integer.parseInt(input) > cats.length + 1 || Integer.parseInt(input) <= 0) {
            System.out.println("Такого кота нет");
            showMenu();
            return false;
        }
        return true;
    }
}
package zholud.homeworks.Users;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Сделать операции с юзером\n" +
                    "2.Сделать операции с продуктом\n" +
                    "0.Выйти");
            switch (scanner.nextInt()) {
                case 1:
                    new FileStorageConsoleApp("C:\\Users\\grigo\\IdeaProjects\\Homeworks\\src\\main\\DirectoryUsers\\",
                            new UserFileStorage())
                            .application();
                    break;
                case 2:
                    new FileStorageConsoleApp("C:\\Users\\grigo\\IdeaProjects\\Homeworks\\src\\main\\DirectoryProducts\\",
                            new ProductFileStorage())
                            .application();
                    break;
                case 0:
                    return;
            }
        }
    }
}

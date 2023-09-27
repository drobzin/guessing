import java.util.Random;
import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {
        System.out.println("Привет!");
        while (playGame()) {
            guessNumber();
        }
    }

    private static boolean playGame() {
        System.out.println("Будешь угадывать? (да/нет)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "да":
                System.out.println("(⌒‿⌒)");
                break;
            case "нет":
                System.out.println("(×﹏×)");
                return false;
            default:
                System.out.println("(︶︹︺)\n непонятно, давай до свидания");
                return false;
        }
        return true;
    }

    private static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("угадай число от 1 до 10");
        int randomNumber = new Random().nextInt(1, 11);
        int userNumber = scanner.nextInt();
        while (userNumber != randomNumber) {
            int difference = Math.abs(userNumber - randomNumber);
            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Читать не умеешь?");
            }
            else if (difference > 5) {
                System.out.println("Холодно");
            }
            else if (difference > 2) {
                System.out.println("Тепло");
            }
            else if (difference >= 1) {
                System.out.println("Жгётся!");
            }
            userNumber = scanner.nextInt();
        }
        System.out.println("(⌒‿⌒)");
    }
}

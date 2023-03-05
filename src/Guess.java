import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(100); // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 1; i <= maxAttempts; i++) {
                int numberOfUser = scanner.nextInt();
                if (numberOfUser == number) {
                    System.out.println("Ты угадал с " + i + " попытки");
                    break;
                } else if (numberOfUser <= number) {
                    System.out.println("Мое число больше! У тебя осталось " + ( 10 - i ) + " попыток");
                } else if (numberOfUser >= number) {
                    System.out.println("Мое число меньше! У тебя осталось " + ( 10 - i ) + " попыток");
                } else if (i == maxAttempts){
                    System.out.println("Ты ну угадал");
                }
            }
        }
    }
}




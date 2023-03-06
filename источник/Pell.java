import java.util.Scanner;
public class Pell {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число от 0 до 30 включительно");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            long pellNumber = 0;
            long pellNumber0 = 0;
            long pellNumber1 = 1;
            long pellNumber2 = 0;

             if (n >= 0 && n <= 30) {
                 if (n == 1) {
                     pellNumber = 1;
                 } else if (n > 1 && n <= 30){
                         for (int i = 2; i <= n; i++) {
                             pellNumber2 = 2 * pellNumber1 + pellNumber0;
                             pellNumber0 = pellNumber1;
                             pellNumber1 = pellNumber2;
                         }
                         pellNumber = pellNumber2;
                     }
                 System.out.println("Число Пелля для " + n + " равно " + pellNumber);
            } else
                 System.out.println("Число не соответствует условию.");
        }
    }
}

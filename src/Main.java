//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {

            try {
                System.out.println("Введите первое целое число: ");
                num1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Введите второе целое число: ");
                num2 = Integer.parseInt(scanner.nextLine());

                System.out.println("Сумма: " + (num1 + num2));
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Неправильный формат ввода. Введите числа повторно. Числа должны быть целыми");
                System.out.println();
            }
        }
        scanner.close();
    }
}

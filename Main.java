import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();

        // Создаем массив строк для хранения введенных значений
        String[] strings = new String[n];

        // Вводим строки с консоли
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }

        // Считаем среднюю длину строки
        int sum = 0;
        for (String string : strings) {
            sum += string.length();
        }
        double averageLength = sum / (double) n;

        // Выводим строки, длина которых меньше средней, и их длины
        System.out.println("Строки, длина которых меньше средней:");
        for (String string : strings) {
            if (string.length() < averageLength) {
                System.out.println(string + " (" + string.length() + ")");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число A: ");
        int A = scanner.nextInt();

        System.out.print("Введите число B: ");
        int B = scanner.nextInt();

        System.out.print("Введите число C: ");
        int C = scanner.nextInt();

        // Проверяем и выводим информацию о числе A.
        System.out.println("\nОтвет о A: " + A);
        if (A % 2 == 0) {
            System.out.println("A - Четное число");
        } else {
            System.out.println("A - Нечетное число");
        }
        if (A % 3 == 0) {
            System.out.println("A - Делится на три");
        } else {
            System.out.println("A - Не делится на три");
        }
        System.out.println();

        // Проверяем и выводим информацию о числе B.
        System.out.println("Ответ о B: " + B);
        if (B % 2 == 0) {
            System.out.println("B - Четное число");
        } else {
            System.out.println("B - Нечетное число");
        }
        if (B % 3 == 0) {
            System.out.println("B - Делится на три");
        } else {
            System.out.println("B - Не делится на три");
        }
        System.out.println();

        // Проверяем и выводим информацию о числе C.
        System.out.println("Ответ о C: " + C);
        if (C % 2 == 0) {
            System.out.println("C - Четное число");
        } else {
            System.out.println("C - Нечетное число");
        }
        if (C % 3 == 0) {
            System.out.println("C - Делится на три");
        } else {
            System.out.println("C - Не делится на три");
        }

        scanner.close();
    }
}




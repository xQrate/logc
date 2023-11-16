import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("№3. Условные выражения");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        System.out.println("число: " + number);
        if (number<=-51 && number>=-137)
        {
            System.out.println("Интервал от -137 до -51");
        }
        else if (number>=55 && number<=123)
        {
            System.out.println("Интервал от 123 до 55");
        }
        else{System.out.println("Не принадлежит ни одному интервалу");}
    }

}
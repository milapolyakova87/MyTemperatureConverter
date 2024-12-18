import java.util.Scanner;

public class MyTemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет, я - Конвертер температуры!");
        System.out.println("Выбери что будем конвертировать:");
        System.out.println("1. Цельсий в Фаренгейт");
        System.out.println("2. Фаренгейт в Цельсий");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введи температуру в градусах Цельсия: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Введи температуру в градусах Фаренгейта: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, celsius);
        } else {
            System.out.println("Неверный выбор. Пожалуйста, выберите 1 или 2.");
        }

        scanner.close();
    }

    // Метод для преобразования Цельсия в Фаренгейт
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Метод для преобразования Фаренгейта в Цельсий
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

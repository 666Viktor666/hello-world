public class Main {
    public static void main(String[] args) {
        System.out.println("Мой первый проект через IDEA!");
        System.out.println("Hello from IntelliJ IDEA!");

        // Добавим новый функционал
        int number = 10;
        String message = "Число: ";
        System.out.println(message + number);

        // Новый код - вычисляем квадрат числа
        int square = number * number;
        System.out.println("Квадрат числа: " + square);

        // Ещё новое - приветствие по имени
        String name = "Виктор";
        System.out.println("Привет, " + name + "!");

        // Тестируем новый класс Name
        Name userName = new Name("Виктор", "Степутенко");
        System.out.println("Полное имя: " + userName.getFullName());
        System.out.println("Инициалы: " + userName.getInitials());

        // Тестируем новый класс Calculator
        System.out.println("\n=== Калькулятор ===");
        Calculator calc = new Calculator();

        int x = 20;
        int y = 5;

        System.out.println(x + " + " + y + " = " + calc.add(x, y));
        System.out.println(x + " - " + y + " = " + calc.subtract(x, y));
        System.out.println(x + " * " + y + " = " + calc.multiply(x, y));
        System.out.println(x + " / " + y + " = " + calc.divide(x, y));
        System.out.println(x + " ^ 2 = " + calc.power(x, 2));
    }
}

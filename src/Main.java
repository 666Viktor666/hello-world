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
    }
}
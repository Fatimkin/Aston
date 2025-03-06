package lesson2.example;

public class Task3 {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}

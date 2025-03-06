package lesson2.example;

public class Task2 {
    public static void main (String[] args) {
        checkSumSIgn();
    }

    private static void checkSumSIgn() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("Cумма отрицательная");
        }
    }
}

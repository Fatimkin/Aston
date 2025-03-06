package lesson3.example;

public class Task6 {
    public void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void main(String[] args) {
        Task6 task = new Task6();

        task.checkNumber(5);
        task.checkNumber(-3);
        task.checkNumber(0);
    }
}
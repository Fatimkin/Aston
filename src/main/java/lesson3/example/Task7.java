package lesson3.example;

public class Task7 {
    public boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
           return false;
    }
}

public static void main(String[] args) {
    Task7 task = new Task7();
    System.out.println(task.isNegative(5));
    System.out.println(task.isNegative(3));
    System.out.println(task.isNegative(0));
    System.out.println(task.isNegative(-1));
}
}

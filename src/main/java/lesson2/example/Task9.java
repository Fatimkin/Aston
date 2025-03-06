package lesson2.example;

public class Task9 {
    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
}
    public static void main(String[] args) {
        Task9 task = new Task9();
    System.out.println(task.isLeapYear(2000));
    System.out.println(task.isLeapYear(1900));
    System.out.println(task.isLeapYear(2024));
    System.out.println(task.isLeapYear(2023));
    System.out.println(task.isLeapYear(2100));
}
}



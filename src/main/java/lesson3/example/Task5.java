package lesson3.example;

public class Task5 {
public boolean checkSumInRange (int a, int b){
    int sum = a + b;

    if (sum >= 10 && sum <= 20) {
        return true;
    } else {
        return false;
    }
}
public static void main(String[] args) {
    Task5 task = new Task5();

    System.out.println(task.checkSumInRange(5, 5));
    System.out.println(task.checkSumInRange(7, 15));
    System.out.println(task.checkSumInRange(10, 5));
    System.out.println(task.checkSumInRange(5, 20));

}
}

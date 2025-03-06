package lesson2.example;

public class Task4 {
    public void compareNumbers() {
         int a = 10;
         int b = 5;

         if (a >= b) {
             System.out.println("a >= b");
         } else {
             System.out.println("a < b");
         }
}
public static void main (String[] args) {
Task4 task = new Task4();
task.compareNumbers();
}
}

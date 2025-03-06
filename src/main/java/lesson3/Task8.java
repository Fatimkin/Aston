package lesson3;

public class Task8 {
    public void printStringMultipleTimes(String text, int count) {
        for (int i =  0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        Task8 task = new Task8();

        task.printStringMultipleTimes("Hello, World", 3);
        task.printStringMultipleTimes("Java is awesome", 2);
        task.printStringMultipleTimes("Test", 5);
    }
}

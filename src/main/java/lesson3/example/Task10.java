package lesson3.example;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходящий масссив: " +Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }

}

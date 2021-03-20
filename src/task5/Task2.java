package task5;

/**
 * Дан массив:
 * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 * необходимо вывести максимальное значение массива.
 */

public class Task2 {

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println(new Task2().maxArray(array));

    }

    public int maxArray(int[] array ){
        int a = 0;
        for (int i = 0; i < array.length; i++) {

            if (a < array[i]) {
                a = array[i];
            }

        }
        return a;
    }
}

package task5;

/**
 * Напишите программу чтобы проверить содержит ли массив опред. значение.
 */

public class Task9 {

    public static void main(String[] args) {

        int[] array = {2, 5, 7, 4, 10};

        System.out.println(exper(5, array));
    }

    public static boolean exper(int a, int[] array ) {

        if (array == null) {
            return false;
        }

        for (int arr: array
             ) {
            if (arr == a) {
                return true;
            }

        }
        return false;
    }
}

package task5;

/**
 * Дан массив:
 * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
 * необходимо вывести сумму элементов массива.
 */

public class Task4 {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int a = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                a = a + array[i][j];

            }

        }
        System.out.println(a);
    }
}

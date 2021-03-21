package task5;

/**
 * Дан массив:
 * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
 * необходимо вывести количество элементов в массиве.
 */
// не понятно почему 16 ?
public class Task7 {

    public static void main(String[] args) {

        int a = 0;

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6, 5, 6, 7}};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                a++;

            }

        }
        System.out.println(a);

    }
}

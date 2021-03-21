package task5;

/**
 Дан массив:
 int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 необходимо вывести среднее арифметическое всех значений массива.

 */

public class Task3 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int a = 0;
        for (int i = 0; i < array.length ; i++) {

            a = a + array[i];


        }
        System.out.println((double)a / array.length);
    }
}

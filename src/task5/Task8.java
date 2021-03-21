package task5;

import java.util.Scanner;

/**
 * Программа, которая находит индекс переданного элемента массива
 */

public class Task8 {

    public static void main(String[] args) {

        int[] array = {3, 4, 7, 10, 11};



        System.out.println(exp(22, null));


    }

    public static int exp(int a, int[] array) {

        if (array == null) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {

            if (a == array[i]) {
                return i;
            }

        }
        return -1;
    }
}

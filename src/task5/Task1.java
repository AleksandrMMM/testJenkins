package task5;

/**
 * Дан массив:
 * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 * необходимо вывести сумму всех значений массива.
 */
// как передать массив в метод ?
public class Task1 {

    int[] array = new int[] {9, 2, 6, 4, 5, 12, 7, 8, 6};

    public int sum(int[] array) {
        int b = 0;
        for (int i = 0; i < array.length; i++) {

            b +=  array[i];
        }

        return b;
    }

    public static void main(String[] args) {

        int c =  new Task1().sum(new Task1().array);

        System.out.println(c);

    }


}

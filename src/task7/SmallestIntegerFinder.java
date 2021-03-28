package task7;

/**
 * Учитывая массив целых чисел, ваше решение должно найти наименьшее целое число.
 *
 * Например:
 *
 *     Учитывая [34, 15, 88, 2], ваше решение вернет 2
 *     Учитывая [34, -345, -1, 100], ваше решение вернет -345
 *
 * Для целей этого ката вы можете предположить, что предоставленный массив не будет пустым.
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int a = args[0];
        for (int i = 0; i < args.length; i++) {


            if (a > args[i]) {

                a = args[i];
            }
        }
        return a;



    }
}

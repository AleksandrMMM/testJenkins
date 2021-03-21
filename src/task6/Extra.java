package task6;

/**
 * Дан массив:
 * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
 * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
 */

public class Extra {

    public static void main(String[] args) {

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int a = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                char[] ch = array[i][j].toCharArray();

                for (int k = 0; k < ch.length; k++) {
                    if (ch[k] == 'е') {
                        a++;
                    }

                }

            }

        }
        System.out.println(a);
    }
}

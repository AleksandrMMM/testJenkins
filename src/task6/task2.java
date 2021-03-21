package task6;

/**
 * Дана строка:
 * String s = “Перевыборы выбранного президента”;
 * необходимо подсчитать количество букв “е” в строке.
 * Для указанной строки ответ будет 4.
 */

public class task2 {

    public static void main(String[] args) {

        int a = 0;
        String s = "Перевыборы выбранного президента";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'е') {
                a++;

            }

        }
        System.out.println(a);


    }
}

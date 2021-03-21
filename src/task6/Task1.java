package task6;

/**
 * Дана строка:
 * String s = “Перестановочный алгоритм быстрого действия”;
 * необходимо вывести все буквы “о” из этой строки.
 * Для указанной строки ответ будет “ооооо” (или в столбик)
 */

public class Task1 {

    public static void main(String[] args) {

        String s = "Перестановочный алгоритм быстрого действия";

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'о') {
                System.out.println(ch[i]);
            }

        }

    }
}

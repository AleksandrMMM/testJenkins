package task2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuRunner {

    static Scanner  scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите номер действия от 1 до 4");
// проблема со сканером как ты и говорил, но я забыл как её решить
        int number = scanner.nextInt();

        if (number < 1 || number > 4) {
            System.out.println("Введите номер действия");
            number = scanner.nextInt();
        }else {
            switch (number) {
                case 1:
                    new Menu().print();
                    break;
                case 2:
                    System.out.println("Введите название и текст меню");
                    String name = scanner.nextLine();
                    String text = scanner.nextLine();

                    MenuItem item = new MenuItem(name, text);

                    System.out.println("Пункт успешно добавлен");
                    break;
                case 3:
                    System.out.println("Удалить пункт меню. Введите команду 1 или 2");
                    int numb = scanner.nextInt();

                    switch (numb) {
                        case 1:
                            System.out.println("введите номер меню.");
                            int numb2 = scanner.nextInt();
                            new Menu().remove(numb2);
                            break;
                        case 2:
                            System.out.println("Введите имя меню");
                            String textDelete = scanner.nextLine();
                            new Menu().remove(textDelete);
                            break;
                        default:
                            System.out.println("что то пошло не так");


                    }
                    break;
                case 4:

                    System.out.println("Введите номер меню для вывода.");
                    int numberPrint = scanner.nextInt();
                    new Menu().clickMenuItem(numberPrint);

                    break;

            }
        }





    }
}

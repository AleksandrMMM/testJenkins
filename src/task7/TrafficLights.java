package task7;

/**
 * Вы пишете код для управления светофором в вашем городе. Вам нужна функция для обработки каждого изменения с зеленого на желтый,
 * красный, а затем снова на зеленый.
 *
 * Завершите функцию, которая принимает строку в качестве аргумента,
 * представляющую текущее состояние источника света, и возвращает строку, представляющую состояние, в которое должен перейти свет.
 *
 * Например, update_light ('green') должен возвращать 'yellow'.
 */



public class TrafficLights {

    public static void main(String[] args) {

        System.out.println(updateLight("green"));


    }

    public static String updateLight(String current) {

        String str = null;

        if (current.equalsIgnoreCase("green")) {
            str = "yellow";
        }else if (current.equalsIgnoreCase("yellow")) {
            str = "red";
        }else if (current.equalsIgnoreCase("red")) {
            str = "green";
        }

        return str;


    }
}

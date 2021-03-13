package Except;

public class Task4 {
// #1
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println();
// #2
        double b = 5;

        for (double i= 1; ;i++  ){
            if (Math.pow(b, i) < 10000 ){
                System.out.println(Math.pow(b, i));


            }else {
                break;
            }

        }

        System.out.println("========================");

        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.

        int c = 41;

        while (c > 40 && c < 60 ){
            if (c % 4 == 0){
                System.out.println(c);
            }
            c = c + 1;
        }

        System.out.println("-----------------------");

        for (int i = 41;40 < i && i < 60; i++ )  {

            while (i % 4 == 0){
                System.out.println(i);
                break;
            }








        }


    }

}

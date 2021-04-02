package task7;

/**
 * https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java
 */

import java.util.Arrays;

public class SortAndStar {

    public static void main(String[] args) {

         String[] s = new String[] {"bitcoin", "take", "over", "athe", "world", "maybe", "who", "knows", "perhaps"};

         twoSort(s);

    }

    public static String[] twoSort(String[] s) {

        Arrays.sort(s);



           char[] ch = s[0].toCharArray();

           char cc = '*';

            for (int j = 0; j < ch.length; j++) {
           //     char[] ch1 = ch[j] + cc;




        }

        return s;
    }
}

package task7;

/**
 * Тимми и Сара думают, что они влюблены, но в том месте, где они живут,
 * они узнают об этом только после того, как срывают каждый по цветку.
 * Если у одного из цветов четное количество лепестков,
 * а у другого нечетное количество лепестков, это означает, что они влюблены.
 *
 * Напишите функцию, которая будет принимать количество лепестков каждого цветка и возвращать истину,
 * если они влюблены, и ложь, если нет.
 */

public class OppositesAttract {


    public static void main(String[] args) {


    }

    public static boolean isLove(final int flower1, final int flower2) {

        boolean loveIs = true;

        if (flower1 % 2 == 0 && flower2 % 2 == 0) {
            loveIs = false;
        }else if (flower1 % 2 != 0 && flower2 % 2 != 0) {
            loveIs = false;
        }

        return loveIs;

    }
}

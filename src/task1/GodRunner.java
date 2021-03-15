package task1;

public class GodRunner {

    public static void main(String[] args) {


    }

    public static Human[] godCreate(){

        Human[] humans = new Human[2];

        humans[0] = new Man("Ivan", 23);
        humans[1] = new Woman("Masha", 20);

        return humans;
    }




}

package task2;

import java.util.Scanner;

public class Menu {
    public static final int MAX_COUNT = 5;
    private int menuCount = 0;

    private MenuItem[] items = new MenuItem[MAX_COUNT];




    public void print() {

        for (MenuItem itemP: items) {
            if (itemP != null) {
                System.out.println(itemP.getId() + ", " + itemP.getName());
            }

        }
    }

    public void Add(MenuItem item) {
        if (menuCount != 0) {
            for (MenuItem test : items) {
                if (item != null && item.getName().equals(item.getName())) {
                    System.out.println("такой пункт есть.");

                }
            }
        }

        item.setId(menuCount + 1);
        items[menuCount++] = item;




    }


    public void remove(int itemNumber) {

        items[itemNumber] = null;


    }
    public void remove(String text) {

        for (int i = 0; i < items.length; i++) {
            if (items[i].getText().equals(text)) {
                items[i] = null;
            }
        }
    }

    public void clickMenuItem(int numberClick){

        System.out.println(items[numberClick].getText());

    }


}

package Lv5.kiosk.kiosk;

import java.util.LinkedList;

public class Menu {

    private int num;
    private String name;
    private LinkedList<MenuItem> menuItems;

    public Menu(int num, String name) {
        this.num = num;
        this.name = name;
        this.menuItems = new LinkedList<>();
    }

    public void addMenuItems(MenuItem menuItem) {
        menuItems.addLast(menuItem);
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public LinkedList<MenuItem> getMenuItems() {
        return menuItems;
    }

}

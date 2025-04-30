package Lv4.kiosk;

public class MenuItem {
    //속
    private int num;
    private String name;
    private double price;
    private String info;

    //생
    public MenuItem (int num,String name,double price,String info){
        this.num = num;
        this.name = name;
        this.price = price;
        this.info = info;
    }
    //기


    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }

}

package Lv1.kiosk;

import java.util.Scanner;

public class Main {

    String name;
    double price;
    String explanatory;

    public Main(String name, double price, String explanatory) {
        this.name = name;
        this.price = price;
        this.explanatory = explanatory;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Main menu1 = new Main("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        Main menu2 = new Main("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        Main menu3 = new Main("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        Main menu4 = new Main("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        int num = 1;

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. " + menu1.name + " | W " + menu1.price + " | " + menu1.explanatory);
            System.out.println("2. " + menu2.name + " | W " + menu2.price + " | " + menu2.explanatory);
            System.out.println("3. " + menu3.name + " | W " + menu3.price + " | " + menu3.explanatory);
            System.out.println("4. " + menu4.name + " | W " + menu4.price + " | " + menu4.explanatory);
            System.out.println("0. 종료");
            System.out.print("입력: ");
            num = sc.nextInt();
            switch (num) {
                case (1) -> System.out.println("1번 메뉴를 장바구니에 담습니다.");
                case (2) -> System.out.println("2번 메뉴를 장바구니에 담습니다.");
                case (3) -> System.out.println("3번 메뉴를 장바구니에 담습니다.");
                case (4) -> System.out.println("4번 메뉴를 장바구니에 담습니다.");
            }
        } while (num != 0);

    }
}
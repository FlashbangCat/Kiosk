package Lv3.kiosk;

import Lv2.kiosk.MenuItem;

import java.util.LinkedList;
import java.util.Scanner;

public class Kiosk {
    //속
    //생
    //기
    public void start() {
        Scanner sc = new Scanner(System.in);
        LinkedList <Lv3.kiosk.MenuItem> list = new LinkedList<>();

        list.addLast(new Lv3.kiosk.MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        list.addLast(new Lv3.kiosk.MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        list.addLast(new Lv3.kiosk.MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        list.addLast(new Lv3.kiosk.MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        int number = 1;

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            for (Lv3.kiosk.MenuItem data : list) {
                System.out.println(data.getNum() + ". " + data.getName() + " | W " + data.getPrice() + " | " + data.getInfo());
            }
            System.out.println("0. 종료");
            System.out.print("입력: ");
            number = sc.nextInt();
            switch (number) {
                case (1) -> System.out.println("1번 메뉴를 장바구니에 담습니다.");
                case (2) -> System.out.println("2번 메뉴를 장바구니에 담습니다.");
                case (3) -> System.out.println("3번 메뉴를 장바구니에 담습니다.");
                case (4) -> System.out.println("4번 메뉴를 장바구니에 담습니다.");
                case (0) -> System.out.println("종료합니다.");
                default -> {
                    System.out.println("유효하지 않은 숫자 입니다.");
                    continue;
                }
            }
        } while (number != 0);
    }
}

package Lv2.kiosk;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<MenuItem> list = new LinkedList<>();

        list.addLast(new MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        list.addLast(new MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        list.addLast(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        list.addLast(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        int number = 1;

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            for (MenuItem data : list) {
                System.out.println(data.num + ". " + data.name + " | W " + data.price + " | " + data.info);
            }
            System.out.println("0. 종료");
            System.out.print("입력: ");
            number = sc.nextInt();
            switch (number) {
                case (1) -> System.out.println("1번 메뉴를 장바구니에 담습니다.");
                case (2) -> System.out.println("2번 메뉴를 장바구니에 담습니다.");
                case (3) -> System.out.println("3번 메뉴를 장바구니에 담습니다.");
                case (4) -> System.out.println("4번 메뉴를 장바구니에 담습니다.");
            }
        } while (number != 0);

    }
}

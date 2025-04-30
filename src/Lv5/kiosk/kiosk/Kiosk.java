package Lv5.kiosk.kiosk;

import java.util.LinkedList;
import java.util.Scanner;

public class Kiosk {
    LinkedList<Menu> menus;

    //생성자
    public Kiosk(LinkedList<Menu> menus) {
        this.menus = menus;
    }

    //키오스크 시작 메서드
    public void start() {
        Scanner sc = new Scanner(System.in);

        int number;
        int numberc;

        do {
            System.out.println("[ MAIN MENU ]");
            for (Menu data : menus) {
                System.out.println(data.getNum() + ". " + data.getName());
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("입력: ");
            number = sc.nextInt();

            switch (number) {
                case (1) -> {
                    do {
                        System.out.println("[ BURGERS MENU ]");
                        for (Menu menu : menus) {
                            if (menu.getName().equals("Burgers")) {
                                for (MenuItem item : menu.getMenuItems()) {
                                    System.out.println(item.getNum() + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getInfo());
                                }
                            }
                        }
                        System.out.println("0. 뒤로가기    | 뒤로가기");
                        System.out.print("입력: ");
                        numberc = sc.nextInt();
                        switch (numberc) {
                            case (1) -> System.out.println("1번 메뉴를 장바구니에 담습니다.");
                            case (2) -> System.out.println("2번 메뉴를 장바구니에 담습니다.");
                            case (3) -> System.out.println("3번 메뉴를 장바구니에 담습니다.");
                            case (4) -> System.out.println("4번 메뉴를 장바구니에 담습니다.");
                            case (0) -> System.out.println("돌아갑니다.");
                            default -> System.out.println("유효하지 않은 값입니다.");
                        }
                    } while (numberc != 0);
                }

                case (2) -> {
                    do {
                        System.out.println("[ Drinks MENU ]");
                        for (Menu menu : menus) {
                            if (menu.getName().equals("Drinks")) {
                                for (MenuItem item : menu.getMenuItems()) {
                                    System.out.println(item.getNum() + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getInfo());
                                }
                            }
                        }
                        System.out.println("0. 뒤로가기    | 뒤로가기");
                        System.out.print("입력: ");
                        numberc = sc.nextInt();
                        switch (numberc) {
                            case (1) -> System.out.println("1번 메뉴를 장바구니에 담습니다.");
                            case (2) -> System.out.println("2번 메뉴를 장바구니에 담습니다.");
                            case (3) -> System.out.println("3번 메뉴를 장바구니에 담습니다.");
                            case (4) -> System.out.println("4번 메뉴를 장바구니에 담습니다.");
                            case (0) -> System.out.println("돌아갑니다.");
                            default -> System.out.println("유효하지 않은 값입니다.");
                        }
                    } while (numberc != 0);
                }
                case (3) -> {
                    do {
                        System.out.println("[ Desserts MENU ]");
                        for (Menu menu : menus) {
                            if (menu.getName().equals("Desserts")) {
                                for (MenuItem item : menu.getMenuItems()) {
                                    System.out.println(item.getNum() + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getInfo());
                                }
                            }
                        }
                        System.out.println("0. 뒤로가기    | 뒤로가기");
                        System.out.print("입력: ");
                        numberc = sc.nextInt();
                        switch (numberc) {
                            case (1) -> System.out.println("1번 메뉴를 장바구니에 담습니다.");
                            case (2) -> System.out.println("2번 메뉴를 장바구니에 담습니다.");
                            case (3) -> System.out.println("3번 메뉴를 장바구니에 담습니다.");
                            case (4) -> System.out.println("4번 메뉴를 장바구니에 담습니다.");
                            case (0) -> System.out.println("돌아갑니다.");
                            default -> System.out.println("유효하지 않은 값입니다.");
                        }
                    } while (numberc != 0);
                }
                default -> {
                    System.out.println("유효하지 않은 값입니다.");
                    continue;
                }
            }
        } while (number != 0);
    }

}

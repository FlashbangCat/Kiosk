package Lv4.kiosk;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Menu> menus = new LinkedList<>();
        Kiosk kiosk = new Kiosk(menus);

        Menu burgersMenu = new Menu(1, "Burgers");
        burgersMenu.addMenuItems(new MenuItem(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItems(new MenuItem(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItems(new MenuItem(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.addMenuItems(new MenuItem(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinksMenu = new Menu(2, "Drinks");
        drinksMenu.addMenuItems(new MenuItem(1, "Coca-Cola", 2.0, "전 세계에서 가장 많이 판매되고 소비되는 음료로서 매일 200여 국가에서 매일 20억 잔씩, 초당 2만 잔이 넘게 팔린다."));
        drinksMenu.addMenuItems(new MenuItem(2, "Chilsung CIDER", 2.0, "롯데칠성음료의 주력 제품으로 생산 중인 사이다. 한국에서 코카콜라 다음으로 가장 많이 팔리는 탄산음료."));
        drinksMenu.addMenuItems(new MenuItem(3, "Dr. Pepper", 2.5, "미국 큐리그 닥터페퍼(Keurig Dr Pepper Inc.)의[6] 닥터페퍼/세븐업사에서 제조해 판매하는 탄산음료 대기업이다. 미국 텍사스 주에 본사가 위치하고 있다."));
        drinksMenu.addMenuItems(new MenuItem(4, "Pine bud Drink", 3.5, "솔잎차를 모티브로 한 혼합음료. 1995년 제일제당에서 처음 발매된 음료였으나 2001년 제일제당이 음료사업을 철수하고 게토레이와 함께 롯데칠성에게 넘겨주어 현재는 롯데칠성에서 제조한다."));

        Menu dessertsMenu = new Menu(3, "Desserts");
        dessertsMenu.addMenuItems(new MenuItem(1, "조각 케이크", 5.0, "달다"));
        dessertsMenu.addMenuItems(new MenuItem(2, "딸기 케이크", 30.0, "달다"));
        dessertsMenu.addMenuItems(new MenuItem(3, "초코 케이크", 35.0, "달다"));
        dessertsMenu.addMenuItems(new MenuItem(4, "웨딩 케이크", 300.0, "달다 비싸다"));

        menus.addLast(burgersMenu);
        menus.addLast(drinksMenu);
        menus.addLast(dessertsMenu);

        kiosk.start();
    }

}
package ifSwithch;

import java.util.Scanner;

public class CoffeePriceSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("무슨 커피를 드릴까요?");
        String coffee = sc.nextLine();
        int price = 0;

        switch (coffee) {
            case "에스프레소"  : price = 3500;
            break;
            case "카푸치노"  : price = 3500;
                break;
            case "카페라뗴"  : price = 3500;
                break;
            case "아이스 아메리카노"  : price = 2000;
                break;
            default:
                System.out.println("주문하신 커피는 주문에 없습니다.");
        }
        if(price != 0) {
            System.out.println("주문하신 " + coffee + " 의 가격은" + price + " 입니다");
        }

    }
}

package ch06;

public class Test {
    public static void main(String[] args) {

        int price = 20000;
        int age = 70;

        // 7세 이하 -> 100% 할인
        if (age <= 7) {
            price = 0;

            // 19세 이하 -> 30% 할인
        } else if (age < 19) {
            price = (int)(price * 0.7);

            // 65세 이상 -> 50% 할인
        } else if (age >= 65) {
            price = (int)(price * 0.5);
        }

        System.out.println("최종 금액 : " + price);
    }
}




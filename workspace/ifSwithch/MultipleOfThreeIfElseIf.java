package ifSwithch;

import java.util.Scanner;

public class MultipleOfThreeIfElseIf {
    public static void main(String[] args) {
        System.out.println("수를 입력하세요(3의배수)");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("3의 배수 입니다");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}

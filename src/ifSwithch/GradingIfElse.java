package ifSwithch;

import java.util.Scanner;

public class GradingIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();



        if (score >= 90) {
            System.out.println("학점은 A 입니다.");
        } else if (score >= 80 && score <= 89) {
            System.out.println("학점은 B 입니다.");
        } else if (score >= 70 && score <= 79) {
            System.out.println("학점은 c 입니다.");
        } else {
            System.out.println("학점은 D 입니다.");
    }

    }
}

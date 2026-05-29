package ifSwithch;

import java.util.Scanner;

public class SuccessOrFailIf {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 80) {
            System.out.println("축하합니다 합격 하셨습니다.");
        }

        sc.close();
    }
}

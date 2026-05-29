package ifSwithch;

import java.util.Scanner;

public class GradingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수을 입력하세요");
        int score = sc.nextInt();
        //char grade = sc.next().charAt(0);

        switch(score/10) {
            case 9:
                System.out.println("학점은 A 입니다.");
                break;
            case 8 :
                System.out.println("학점은 B 입니다.");
                break;
            case 7:
                System.out.println("학점은 C 입니다.");
                break;
            default :
                System.out.println("학점은 D 입니다.");

        }

    }
}

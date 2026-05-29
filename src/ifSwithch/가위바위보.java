package ifSwithch;

import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다 가위 , 바위 , 보 중에 입력하세요");
        System.out.println("철수 >> ");
        String putMen = sc.next();
        System.out.println("영희>> ");
        String putWomen = sc.next();

        int men = 0;
        int women = 0;

        if (putMen.equals("가위")) {
            men = 0;
        }

        if (putMen.equals("바위")) {
            men = 1;
        }

        if (putMen.equals("보")) {
            men = 2;
        }

        if (putWomen.equals("가위")) {
            women = 0;
        }

        if (putWomen.equals("바위")) {
            women = 1;
        }

        if (putWomen.equals("보")) {
            women = 2;
        }

        if (men == women) {
            System.out.println("무승부");
        } else if (men < women) {
            System.out.println("철수가 이겼습니다");
        } else if (men > women) {
            System.out.println("영희가 이겼습니다");
        } else {
            System.out.println("잘못 입력하셨습니다");
        }

    }
}

package ifSwithch;

import java.util.Scanner;

public class 가위바위보2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다 가위 , 바위 , 보 중에 입력하세요");
        System.out.println("철수 >> ");
        String putMen = sc.next();
        System.out.println("영희>> ");
        String putWomen = sc.next();

        if (putMen.equals("가위")) {
            if (putWomen.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            } else if (putWomen.equals("보")) {
                System.out.println("철수가 이겼습니다.");
            }
        }
            if (putMen.equals("바위")) {
                if (putWomen.equals("보")) {
                    System.out.println("영희가 이겼습니다.");
                } else if (putWomen.equals("가위")) {
                    System.out.println("철수가 이겼습니다.");
                }

            }
                if (putMen.equals("보")) {
                    if (putWomen.equals("가위")) {
                        System.out.println("영희가 이겼습니다.");
                    } else if (putWomen.equals("바위")) {
                        System.out.println("철수가 이겼습니다.");
                    }
                    } else {
                    System.out.println("잘못 입력하셨습니다.");
                }




                if(putMen.equals(putWomen)) {
                    System.out.println("무승부");
                }
                }
            }




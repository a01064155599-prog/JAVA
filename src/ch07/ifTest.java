package ch07;

import java.util.Scanner;
public class ifTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("E");
        } else {
            System.out.println("그 외의 점수입니다 다시 시도해주세요");
        }

        sc.close();
    }
}

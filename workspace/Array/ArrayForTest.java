package Array;

import java.util.Scanner;

public class ArrayForTest {
    public static void main(String[] args) {
        System.out.println("단을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        int[] nums = new int[9];


        for (int i = 1; i <= nums.length; i++) {
            //System.out.println(dan * i);
        }

        while (true) {
            System.out.println("곱할 숫자를 입력하세요");
            int num = sc.nextInt();
            if(num == 0) {
                break;
            }
            System.out.println(dan * num);

        }


    }
}
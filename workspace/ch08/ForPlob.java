package ch08;

public class ForPlob {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


        //1~100 짝수 합계

        int sum2 = 0;
        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0) {
                sum2 += x;
            }
        }
        System.out.println(sum2);


        //1~100 홀수 합계

        int sum3 = 0;
        for (int y = 0; y <= 100; y++) {
            if (y % 2 == 1) {
                sum3 += y;
            }
        }
        System.out.println(sum3);
    }

}




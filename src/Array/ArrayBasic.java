package Array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] score = new int[3];
        String[] name = new String[3];

        name[0] = "하루";
        name[1] = "보통";
        name[2] = "안녕";

        score[0] = 1;
        score[1] = 2;
        score[2] = 3;

        System.out.println(score[1]);

        for(String i : name) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(name));

        for(int x = 0; x < score.length; x++) {
            System.out.println(score[x]);
        }




    }
}

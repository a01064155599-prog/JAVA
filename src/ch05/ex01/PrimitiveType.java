package ch05.ex01;


public class PrimitiveType {
    public static void main(String[] args) {
        int age;
        age = 25;
        System.out.println(age);
        age = 30;
        System.out.println(age);

        int score = 100; // 변수 선언하고 동시에 값 할당
        System.out.println(100);

        int x = 10;
        int y = x++; // 후위 연산: x의 현재 값인 10을 y에 먼저 대입한 후 x를 1 증가시킴 (x는 11, y는 10이 됨)
        System.out.println("x: " + x + ", y: " + y); // x: 11, y: 10
    }

    }


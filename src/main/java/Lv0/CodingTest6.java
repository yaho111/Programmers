package Lv0;

import java.util.Scanner;

// [Day2] 덧셈식 출력하기
public class CodingTest6 {
    public static void main(String[] args) {
        // 방법 1. println 사용
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));

        // 방법 2. printf 사용
//        Scanner sc2 = new Scanner(System.in);
//        int c = sc2.nextInt();
//        int d = sc2.nextInt();
//
//        System.out.printf("%d + %d = %d",c,d,c+d);
    }
}

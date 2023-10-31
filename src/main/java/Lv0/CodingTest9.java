package Lv0;

import java.util.Scanner;

// [Day2] 홀짝 구분하기
public class CodingTest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 방법1. if 조건문 사용
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        // 방법2. 삼항연산자 사용
//        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}

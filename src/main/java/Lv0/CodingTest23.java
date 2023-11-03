package Lv0;

import java.util.Scanner;

// [Day5] 주사위 게임 2
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181930
class Solution3 {
    public int sumDice(int a, int b, int c) {
        int result = 0;
        if (a != b && a != c && b != c) {
            result = a + b + c;
        } else if (a == b && a == c && b == c) {
            result = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);     // Math.pow(a, 2) 가능
        } else {
            result = (a + b + c) * (a*a + b*b + c*c);
        }

        return result;
    }
}

public class CodingTest23 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        // a 입력 받기
        while (true) {
            System.out.println("1부터 6까지의 정수를 입력하세요.");
            a = sc.nextInt();
            if (a >= 1 && a <= 6) {
                break; // 조건에 맞으면 루프 탈출
            } else {
                System.out.println("입력 가능한 수는 1부터 6까지의 정수입니다.");
            }
        }

        // b 입력 받기
        while (true) {
            System.out.println("1부터 6까지의 정수를 입력하세요.");
            b = sc.nextInt();
            if (b >= 1 && b <= 6) {
                break; // 조건에 맞으면 루프 탈출
            } else {
                System.out.println("입력 가능한 수는 1부터 6까지의 정수입니다.");
            }
        }

        // c 입력 받기
        while (true) {
            System.out.println("1부터 6까지의 정수를 입력하세요.");
            c = sc.nextInt();
            if (c >= 1 && c <= 6) {
                break; // 조건에 맞으면 루프 탈출
            } else {
                System.out.println("입력 가능한 수는 1부터 6까지의 정수입니다.");
            }
        }
        sc.close();
        System.out.println("입력한 세 개의 정수는: a=" + a + ", b=" + b + ", c=" + c);

        int result = s.sumDice(a, b, c);
        System.out.println("조건에 따른 a, b, c의 합은: " + result);
    }
}

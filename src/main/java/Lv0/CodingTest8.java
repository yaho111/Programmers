package Lv0;

import java.util.Scanner;

// [Day2] 문자열 돌리기
public class CodingTest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 방법1. charAt() 사용
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            System.out.println(val);
        }

        // 방법2. toCharArray() 사용
//        for (char val: str.toCharArray()) {
//            System.out.println(val);
//        }
    }
}

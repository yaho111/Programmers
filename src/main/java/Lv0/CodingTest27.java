package Lv0;

import java.util.Arrays;

// [Day6] 수 조작하기1
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181926
class Solution7 {
    public int addNumber(int n, String control) {
        // 방법1. 반복문과 charAt() 이용
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            if (c == 'w') {
                n += 1;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }
        return n;

        // 방법2. 반복문과 toCharArray() 이용
//        for (char c: control.toCharArray()) {
//            if (c == 'w') {
//                n += 1;
//            } else if (c == 's') {
//                n -= 1;
//            } else if (c == 'd') {
//                n += 10;
//            } else if (c == 'a') {
//                n -= 10;
//            }
//        }
//        return n;

        // 방법3. if 조건문 대신 switch case 이용
//        for (char ch : control.toCharArray()) {
//            switch(ch) {
//                case 'w': n += 1; break;
//                case 's': n -= 1; break;
//                case 'd': n += 10; break;
//                case 'a': n -= 10; break;
//                default:break;
//            }
//        }
//        return n;
    }
}

public class CodingTest27 {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        int n = 0;
        String control = "wsdawsdassw";

        int result = s.addNumber(n, control);
        System.out.println("결과: " + result);   // -1
    }
}

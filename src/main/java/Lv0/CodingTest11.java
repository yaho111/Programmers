package Lv0;

import java.util.Scanner;

// [Day3] 문자열 섞기
public class CodingTest11 {
    public static void main(String[] args) {
        String str1 = "aaaa";
        String str2 = "bbbb";

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            String result = String.valueOf(c1) + String.valueOf(c2);
            System.out.print(result);
        }
    }
}

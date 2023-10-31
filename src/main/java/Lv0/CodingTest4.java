package Lv0;

import java.util.Scanner;
import java.lang.*;

public class CodingTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();
        char[] chars = a.toCharArray();
        for (int i=0; i<chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());
    }
}
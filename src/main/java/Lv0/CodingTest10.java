package Lv0;

import java.util.Scanner;

// [Day2] 문자열 겹쳐쓰기
public class CodingTest10 {
    public String solution(String my_string, String overwrite_string, int s) {
        int index = overwrite_string.length();
        String str1 = my_string.substring(0, s);
        String str2 = my_string.substring(s+index);

        String answer = "";
        answer = str1 + overwrite_string + str2;
        return answer;
    }

    public static void main(String[] args) {
        // 1. Scanner 객체 생성하여 문자열 2개, 정수 1개 입력 받음
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        // 2. 입력받은 값을 solution() 메소드에 전달
        CodingTest10 c = new CodingTest10();
        String result = c.solution(my_string, overwrite_string, s);

        // 3. solution() 메소드 반환 값 출력
        System.out.println(result);
    }
}

package Lv0;

// [Day5] 코드 처리하기
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181932
class Solution1 {
    public String convertor(String code) {
        // 변수 초기화
        int mode = 0;
        String ret = "";
        // code 길이만큼 for문 반복
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (mode == 0) {                    // mode가 0일때
                if (c != '1' && i % 2 == 0) {   // code[i]가 짝수일 때만 값을 가져옴
                    ret += c;
                } else if (c == '1') {
                    mode = 1;
                }
            } else if (mode == 1) {             // mode가 1일때
                if (c != '1' && i % 2 != 0) {   // code[i]가 홀수일 때만 값을 가져옴
                    ret += c;
                } else if (c == '1') {
                    mode = 0;
                }
            }
        }
        if (ret == "") {
            ret = "EMPTY";                      // ret 최종 값이 빈문자열이면 "EMPTY" 출력
        }
        return ret;
    }
}

public class CodingTest21 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String code = "a1cde";
        String result = s.convertor(code);
        System.out.println(result);
    }
}

package Lv0;

// [Day6] 수 조작하기2
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181925
class Solution8 {
    public String numLog(int[] numLog) {
        String answer = "";
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < numLog.length - 1; i++) {
            int n = numLog[i+1] - numLog[i];
            if (n == 1) {
                bf.append("w");
            } else if (n == -1) {
                bf.append("s");
            } else if (n == 10) {
                bf.append("d");
            } else if (n == -10) {
                bf.append("a");
            }
        }
        answer = bf.toString();
        return answer;
    }
}

public class CodingTest28 {
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result = s.numLog(numLog);
        System.out.println("결과: " + result);   // wsdawsdassw
    }
}

package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [Day7] 콜라츠 수열 만들기
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181919
class Solution14 {
    public int[] collatzSequence(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList();

        while (true) {
            list.add(n);

            if (n % 2 == 0) {
                n = n / 2;
            } else if (n == 1) {         // while (n != 1) 로 가능
                break;
            } else {
                n = 3 * n + 1;
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

public class CodingTest34 {
    public static void main(String[] args) {
        Solution14 s = new Solution14();
        int n = 10;
        int[] result = s.collatzSequence(n);
        System.out.println("결과: " + Arrays.toString(result));   // [10, 5, 16, 8, 4, 2, 1]
    }
}

package Lv0;

import java.util.*;

// [Day7] 배열 만들기 2
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181921
class Solution12 {
    public int[] makeNumList(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {          // 주어진 값 5부터 555까지 반복
            String numStr = Integer.toString(i);
            boolean isOnlyZeroAndFive = true;   // 해당 숫자가 5 또는 0으로만 이루어져 있는지 확인하는 플래그 변수

            for (char c: numStr.toCharArray()) {    // toCharArray로 숫자를 분할하여 살펴봄 (ex. 50 -> 5 0)
                if (c != '0' && c != '5') {
                    isOnlyZeroAndFive = false;
                    break;
                }
            }

            if (isOnlyZeroAndFive) {
                list.add(i);
            }
        }

        int[] answer;               // return할 int 배열 선언
        if (list.size() == 0) {     // list에 담긴 값이 없으면 (= 5나 0으로만 이루어진 숫자가 하나도 없으면)
            answer = new int[]{-1};
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}

public class CodingTest32 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        int n = 5;
        int r = 555;
        int[] result = s.makeNumList(n, r);
        System.out.println("결과: " + Arrays.toString(result));   // [5, 50, 55, 500, 505, 550, 555]
    }
}

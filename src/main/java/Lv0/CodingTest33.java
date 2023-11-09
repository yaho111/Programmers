package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [Day7] 카운트 업
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181920
class Solution13 {
    public int[] countUp(int start_num, int end_num) {
        // 방법1.
        int[] answer = {};
        List<Integer> list = new ArrayList();

        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

        // 방법2.
//        int[] answer = new int[end - start+1];
//        for(int i =0; i<= end - start; i++) {
//            answer[i] = start + i;
//        }
//        return answer;
    }
}

public class CodingTest33 {
    public static void main(String[] args) {
        Solution13 s = new Solution13();
        int start_num = 3;
        int end_num = 10;
        int[] result = s.countUp(start_num, end_num);
        System.out.println("결과: " + Arrays.toString(result));   // [3, 4, 5, 6, 7, 8, 9, 10]
    }
}

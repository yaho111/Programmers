package Lv0;

import java.util.Arrays;

// [Day6] 수열과 구간 쿼리 3
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181924
class Solution9 {
    public int[] switchNumber(int[] arr, int[][] queries) {
        // 방법1. 다중 for문 이용
        int[] answer = {};
        int index1 = 0;
        int index2 = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = 1; j < queries[i].length; j++) {
                index1 = queries[i][j];     // 3
                for (int k = 0; k < queries[i].length - 1; k++) {
                index2 = queries[i][k];     // 0
                }
                temp1 = arr[index1];    // 3
                temp2 = arr[index2];    // 0
                arr[index1] = temp2;
                arr[index2] = temp1;
            }
        }
        answer = arr;
        return answer;
        // 방법2. 2차원 배열을 1차원 배열로 하나씩 꺼내서 index 구하기
//        int[] answer = Arrays.copyOf(arr, arr.length);
//
//        for (int[] query : queries) {
//            int i = query[0];
//            int j = query[1];
//
//            int temp = answer[i];
//            answer[i] = answer[j];
//            answer[j] = temp;
//        }
//
//        return answer;
    }
}

public class CodingTest29 {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2},{1, 4}};
        int[] result = s.switchNumber(arr, queries);
        System.out.println("결과: " + Arrays.toString(result));   // [3, 4, 1, 0, 2]
    }
}

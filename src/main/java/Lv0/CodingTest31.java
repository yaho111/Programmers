package Lv0;

import java.util.*;
import java.util.stream.Stream;

// [Day7] 수열과 구간 쿼리 4
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181922
class Solution11 {
    public int[] increaseNumbers(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];   // 0
            int e = query[1];   // 4
            int k = query[2];   // 2

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}

public class CodingTest31 {
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2},{0, 3, 3}};
        int[] result = s.increaseNumbers(arr, queries);
        System.out.println("결과: " + Arrays.toString(result));   // [3, 2, 4, 6, 4]
    }
}

package Lv0;

import java.util.*;
import java.util.stream.Stream;

// [Day6] 수열과 구간 쿼리 2
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181923
class Solution10 {
    public int[] selectNumver(int[] arr, int[][] queries) {
        // 각각의 쿼리에서 조건을 만족하는 값을 담을 list 객체 생성
        List<Integer> list1 = new ArrayList<Integer>();
        // queries를 하나씩 꺼내서 query 하나씩 실행
        for (int[] query : queries) {
            int s = query[0];   // 0
            int e = query[1];   // 4
            int k = query[2];   // 2
            // arr[s] ~ arr[e]까지의 값을 담을 list 객체 생성
            List<Integer> list2 = new ArrayList<Integer>();
            // arr[s] ~ arr[e] 값 담기
            for (int i = s; i <= e; i++) {
                list2.add(arr[i]);      // [0, 1, 2, 4, 3]
            }
            // k보다 큰 값 찾기
            Stream<Integer> result = list2.stream().filter(item -> item > k);   // [3, 4]
            // k보다 큰 값들 중 최솟값 찾기
            Optional<Integer> minResult = result.min(Comparator.naturalOrder());    // 3
            // 최솟값 또는 -1을 list에 넣기
            if(minResult.isPresent()) {
                Integer minValue = minResult.get();
                list1.add(minValue);
            } else {
                list1.add(-1);
            }
        }

        int[] answer = new int[list1.size()];

        for (int i = 0; i < list1.size(); i++) {
             answer[i] = list1.get(i);
        }

        return answer;
    }
}

public class CodingTest30 {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2},{0, 2, 2}};
        int[] result = s.selectNumver(arr, queries);
        System.out.println("결과: " + Arrays.toString(result));   // [3, 4, -1]
    }
}

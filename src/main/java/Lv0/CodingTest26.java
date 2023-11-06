package Lv0;

import java.util.ArrayList;
import java.util.Arrays;

// [Day6] 마지막 두 원소
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181927
class Solution6 {
    public int[] addNumber(int[] num_list) {
        // 방법 1. 배열 복사
        // 새로운 크기의 배열 생성
        int[] new_list = new int[num_list.length + 1];
        // 기존 배열의 내용을 복사
        System.arraycopy(num_list, 0, new_list, 0, num_list.length);
        // 마지막 원소, 그 전 원소를 비교하여 값에 따라 마지막 원소 추가
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {    // 마지막 원소가 그 전 원소보다 클 때
            new_list[new_list.length - 1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {                                                            // 마지막 원소가 그 전 원소보다 크지 않을 때
            new_list[new_list.length - 1] = num_list[num_list.length-1] * 2;
        }
        return new_list;

        // 방법 2. List 활용
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i : num_list) temp.add(i);
//
//        int last = num_list[num_list.length - 1];
//        int plast = num_list[num_list.length - 2];
//
//        if (last > plast) temp.add(last-plast);
//        else temp.add(last * 2);
//
//        int[] answer = temp.stream().mapToInt(Integer::intValue).toArray();
//        return answer;
    }
}

public class CodingTest26 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        int[] num_list = {2, 1, 6};

        int[] result = s.addNumber(num_list);
        System.out.println("결과: " + Arrays.toString(result));   // [2, 1, 6, 5]
    }
}

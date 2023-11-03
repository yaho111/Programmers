package Lv0;

import java.util.Scanner;

// [Day5] 원소들의 곱과 합
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181929
class Solution4 {
    public int sumAndProduct(int[] num_list) {
        int result = 0;
        int sum = 0;
        int product = 1;
        for (int num : num_list) {
            sum += num;
            product *= num;
        }
        result = product < sum * sum ? 1 : 0;

        return result;
    }
}

public class CodingTest24 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] num_list = {5, 7, 8, 3};

        int result = s.sumAndProduct(num_list);
        System.out.println("결과: " + result);
    }
}

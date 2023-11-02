package Lv0;

// [Day5] 등차수열의 특정한 항만 더하기
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181931
class Solution2 {
    public int sumTrue(int a, int d, boolean[] included) {
        int result = 0;
        int[] numArr = new int[included.length];
        for (int i = 0; i < included.length; i++) {
            if (i == 0) {                   // numArr[i] = a + i * d; 이렇게도 가능!
                numArr[i] = a;
            } else {
                numArr[i] = numArr[i-1] + d;
            }
            if (included[i]) {
                result += numArr[i];
            }
        }
        return result;
    }
}

public class CodingTest22 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        int result = s.sumTrue(a, d, included);
        System.out.println(result);
    }
}

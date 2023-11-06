package Lv0;

// [Day5] 이어 붙인 수
// 문제 확인: https://school.programmers.co.kr/learn/courses/30/lessons/181928
class Solution5 {
    public int arrangeNumbers(int[] num_list) {
        int answer = 0;
        String oddArr = "";
        String evenArr = "";

        for(int num: num_list) {
            if (num % 2 == 0) {
                evenArr = evenArr + "" + num;
            } else {
                oddArr = oddArr + "" + num;
            }
        }
        answer = Integer.parseInt(oddArr) + Integer.parseInt(evenArr);
        return answer;
    }
}

public class CodingTest25 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        int[] num_list = {5, 7, 8, 3};

        int result = s.arrangeNumbers(num_list);
        System.out.println("결과: " + result);
    }
}

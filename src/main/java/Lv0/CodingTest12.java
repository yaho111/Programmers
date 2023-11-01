package Lv0;

// [Day3] 문자 리스트를 문자열로 변환하기
class Solution {
    public String solution(String[] arr) {
        // 방법1. for문과 +=를 사용하여 배열 요소를 하나씩 이어붙이는 방법
        String answer = "";
        for (String val: arr) {
            answer += val;
        }
        return answer;

        // 방법2. join() 메소드 사용하는 방법
//        return String.join("", arr);
    }
}

public class CodingTest12 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = new String[]{"a", "b", "c"}; // 또는 String[] arr = {"a", "b", "c"};
        String result = s.solution(arr);
        System.out.println(result);
    }
}

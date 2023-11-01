package Lv0;

// [Day3] 문자열 곱하기
class Repeat {
    public String repeatString(String my_string, int k) {
        // 방법1. for문과 += 사용
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;

        // 방법2. repeat() 메소드 사용
//        return my_string.repeat(k);
    }
}

public class CodingTest13 {
    public static void main(String[] args) {
        Repeat r = new Repeat();
        String my_string = "love";
        int k = 3;
        String result = r.repeatString(my_string, k);
        System.out.println(result);
    }
}

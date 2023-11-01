package Lv0;

// [Day3] 더 크게 합치기
class Compare {
    public int compareTwo(int a, int b) {
        int answer = 0;
        String sum1 = String.valueOf(a) + String.valueOf(b);    // "" + a + b 이렇게 빈 문자열을 이용해서 이어붙이는 것도 가능
        String sum2 = String.valueOf(b) + String.valueOf(a);    // String.valueOf(int) 대신 명시적으로 Integer.toString() 사용 가능

        int num1 = Integer.valueOf(sum1);   // = Integer.parseInt()
        int num2 = Integer.valueOf(sum2);

        answer = num1 > num2 ? num1 : num2;

        return answer;
    }
}

public class CodingTest14 {
    public static void main(String[] args) {
        Compare c = new Compare();
        int a = 10;
        int b = 2;
        int result = c.compareTwo(a, b);
        System.out.println(result);
    }
}

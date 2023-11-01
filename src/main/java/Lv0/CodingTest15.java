package Lv0;

// [Day3] 두 수의 연산값 비교하기
class Compare2 {
    public int compareCalculation(int a, int b) {
        int answer = 0;
        String num = "" + a + b;
        int val1 = Integer.parseInt(num);
        int val2 = 2 * a * b;

        // 방법1.
        answer = val1 > val2 ? val1 : val2;

        // 방법2.
//        answer = Math.max(val1, val2);

        return answer;
    }
}

public class CodingTest15 {
    public static void main(String[] args) {
        Compare2 c = new Compare2();
        int a = 10;
        int b = 2;
        int result = c.compareCalculation(a, b);
        System.out.println(result);
    }
}

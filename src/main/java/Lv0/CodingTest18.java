package Lv0;

// [Day4] 홀짝에 따라 다른 값 반환하기
class Compare5 {
    public int sumNumbers(int n) {
        int sum = 0;
        if (n % 2 == 0) {   // n이 짝수면
            for (int i = 2; i <= n; i += 2) {
               sum += (i * i);
            }
        } else {            // n이 홀수면
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }
        return sum;
    }
}

public class CodingTest18 {
    public static void main(String[] args) {
        Compare5 c = new Compare5();
        int n = 10;
        int result = c.sumNumbers(n);
        System.out.println(result);
    }
}

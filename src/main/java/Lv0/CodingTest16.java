package Lv0;

// [Day3] n의 배수
class Compare3 {
    public int compareMultiple(int num, int n) {
        if (num % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class CodingTest16 {
    public static void main(String[] args) {
        Compare3 c = new Compare3();
        int num = 10;
        int n = 2;
        int result = c.compareMultiple(num, n);
        System.out.println(result);
    }
}

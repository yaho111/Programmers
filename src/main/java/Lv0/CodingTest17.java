package Lv0;

// [Day4] 공배수
class Compare4 {
    public int compareCommonMultiple(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class CodingTest17 {
    public static void main(String[] args) {
        Compare4 c = new Compare4();
        int number = 15;
        int n = 3;
        int m = 5;
        int result = c.compareCommonMultiple(number, n, m);
        System.out.println(result);
    }
}

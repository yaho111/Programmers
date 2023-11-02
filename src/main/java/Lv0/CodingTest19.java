package Lv0;

// [Day4] 조건 문자열
class Compare6 {
    public int operation(String ineq, String eq, int n, int m) {
        int result = 0;
        String operator = ineq + eq;
        if (operator.equals(">=")) {
            result = (n >= m) ? 1: 0;
        } else if (operator.equals("<=")) {
            result = (n <= m) ? 1: 0;
        } else if (operator.equals(">!")) {
            result = (n > m) ? 1: 0;
        } else if (operator.equals("<!")) {
            result = (n < m) ? 1: 0;
        }
        return result;
    }
}

public class CodingTest19 {
    public static void main(String[] args) {
        Compare6 c = new Compare6();
        String ineq = "<";
        String eq = "=";
        int n = 100;
        int m = 30;
        int result = c.operation(ineq, eq, n, m);
        System.out.println(result);
    }
}

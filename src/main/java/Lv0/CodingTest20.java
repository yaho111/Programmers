package Lv0;

// [Day4] flag에 따라 다른 값 반환하기
class Compare7 {
    public int operation(int a, int b, boolean flag) {
        int result = 0;
        // 방법1.
        if (flag) {
            result = a + b;
        } else {
            result = a - b;
        }
        return result;
        // 방법2.
//        return flag ? a + b : a - b;
    }
}

public class CodingTest20 {
    public static void main(String[] args) {
        Compare7 c = new Compare7();
        int a = 4;
        int b = 9;
        boolean flag = false;
        int result = c.operation(a, b, flag);
        System.out.println(result);
    }
}

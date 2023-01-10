public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c) {
        return (a + b) == c;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));       // false
        System.out.println(hasEqualSum(1, 1, 2));       // true
        System.out.println(hasEqualSum(1, -1, 0));      // true
    }
}

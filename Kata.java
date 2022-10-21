public class Kata {

    public static Integer basicMath(String op, int v1, int v2) {
        if (op.contains("/")) {
            return v1 / v2;
        } else if (op.contains("+")) {
            return v1 + v2;
        } else if (op.contains("-")) {
            return v1 - v2;
        } else {
            return v1 * v2;
        }
    }
}

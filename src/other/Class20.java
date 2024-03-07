package other;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 有效括号
 */
public class Class20 {

    public static void main(String[] args) {
        boolean result1 = isValid("[]");
        boolean result2 = isValid(("[sfsd]"));
        boolean result3 = isValid("[[]");
        boolean result4 = isValid("123123");

        System.out.println(
                "reuslt1 = " + result1 + "; result2 = " + result2 + "; result3 = " + result3 + "result4 = " + result4);
    }

    public static boolean isValid(String s) {
        if (null == s || s.isEmpty()) {
            return false;
        }

        Deque<Character> deque = new ArrayDeque<>();
        for (char item : s.toCharArray()) {
            if (item == '[' || item == '{' || item == '(') {
                deque.push(item);
            } else {
                if (deque.isEmpty() || !match(deque.poll(), item)) {
                    return false;
                }
            }

        }

        return deque.isEmpty();

    }

    private static boolean match(char l, char r) {
        if (l == '[' && r == ']' || l == '{' && r == '}' || l == '(' && r == ')') {
            return true;
        }

        return false;
    }
}
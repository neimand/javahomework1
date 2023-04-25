import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class program7 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println("[]{<()[]<>>}"); // true
    }
    
    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        Map<Character, Character> scob = new HashMap<>();
        scob.put(')', '(');
        scob.put(']', '[');
        scob.put('}', '{');
        scob.put('>', '<');

        char[] list = parentheses.toCharArray();
        if (list.length == 1) {
            return false;
        }
        Deque<Character> result = new ArrayDeque<>();
        

        for (int i = 0; i < list.length; i++) {
            if (scob.containsValue(list[i])) {
                result.addLast(list[i]);
            } else if (scob.containsKey(list[i])) {
                if (result.pollLast() != scob.get(list[i])) {
                    return false;
                }
            }
        }
        
        return true;
        
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся
    }
    
}

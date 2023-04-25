import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayDeque;

public class program6 {
    public static void main(String[] args) {
        boolean flag = true;
        Deque<String> result = new ArrayDeque<>();
        System.out.println(result);
        while (flag) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("print")) {
                Iterator<String> it = result.descendingIterator();
                while (it.hasNext()) {
                    String next = it.next();
                    System.out.print(next + " ");
                    
                }
                System.out.println();
            }
            else if (input.equals("revert")) {
                result.pollLast();
            }
            else if (input.equals("exit")) {
                flag = false;
            } else {
                result.addLast(input);
            }
            System.out.println(result);
        }
    }
}
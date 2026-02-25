import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * =========================================================
 * Use Case 6: Queue + Stack Based Palindrome Check
 * =========================================================
 * Uses Queue (FIFO) and Stack (LIFO) to validate palindrome.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // insert characters into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not Palindrome");
        }

        scanner.close();
    }
}
}
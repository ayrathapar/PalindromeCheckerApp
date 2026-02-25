import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * =========================================================
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * =========================================================
 * Uses Deque to compare front and rear characters.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // compare first and last characters
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
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
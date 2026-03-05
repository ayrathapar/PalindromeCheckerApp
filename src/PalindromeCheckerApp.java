import java.util.Scanner;
import java.util.LinkedList;

/**
 * =========================================================
 * Use Case 8: Linked List Based Palindrome Checker
 * =========================================================
 * Uses LinkedList to compare first and last characters.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // add characters to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // compare first and last elements
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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
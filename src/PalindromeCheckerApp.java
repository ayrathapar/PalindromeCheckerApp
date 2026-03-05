import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for(char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while(list.size() > 1) {
            if(!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Result: Palindrome");
        else
            System.out.println("Result: Not Palindrome");

        scanner.close();
    }
}
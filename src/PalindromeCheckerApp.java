public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

}
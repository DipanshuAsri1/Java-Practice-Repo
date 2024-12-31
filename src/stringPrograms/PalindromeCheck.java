package stringPrograms;

public class PalindromeCheck {


        public static boolean isPalindrome(String s) {
            // Remove non-alphanumeric characters and convert to lowercase
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            int i = 0, j = s.length() - 1;

            while (i < j) {
                // Compare characters from the beginning and end of the string
                if (s.charAt(i) != s.charAt(j)) {
                    return false; // Not a palindrome
                }
                i++;
                j--;
            }

            return true; // Palindrome
        }

        public static void main(String[] args) {
            String s = "A man, a plan, a canal, Panama";
            boolean isPal = isPalindrome(s);
            System.out.println("Is the string a palindrome? " + isPal);
        }


}

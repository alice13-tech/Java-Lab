public class PalindromeRecursion {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return checkPalindrome(s, 0, s.length() - 1);
    }

    private static boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";
        System.out.println(isPalindrome(input));
    }
}

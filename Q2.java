public class Q2 {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "doctor";
        System.out.println("Is '" + str1 + "' a palindrome? " + isPalindrome(str1));
        System.out.println("Is '" + str2 + "' a palindrome? " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

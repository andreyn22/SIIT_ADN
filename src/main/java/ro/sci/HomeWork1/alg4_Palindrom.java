//Check if a number is palindrom( e.g palindrom 1221, 34143)

package main.java.ro.sci.HomeWork1;

public class alg4_Palindrom {
    public static void main(String[] args) {
        String s1 = "1221";
        String s2 = "34143";
        String s3 = "46434";

        System.out.println("The provided string" + s1 + " is palindrome: " + isPalindrome(s1));
        System.out.println("The provided string" + s2 + " is palindrome: " + isPalindrome(s2));
        System.out.println("The provided string" + s3 + " is palindrome: " + isPalindrome(s3));
    }
    private static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        int n = s.length() / 2;
        int lenght = s.length() - 1;
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) != s.charAt(lenght - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}

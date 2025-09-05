package com.mfr.dsa.twopointers;


/**
 * https://www.educative.io/courses/grokking-coding-interview/valid-palindrome
 * Statement
 *
 * Given a string, s, return TRUE if it is a palindrome; otherwise, return FALSE.
 *
 * A phrase is considered a palindrome if it reads the same backward as forward after converting all uppercase letters to lowercase and removing any characters that are not letters or numbers. Only alphanumeric characters (letters and digits) are taken into account.
 *
 * Constraints:
 *
 *     1≤1≤ s.length ≤3000≤3000
 *
 *     s consists only of printable ASCII characters.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        //String str = "Able was I, I saw elba";
        String str = "Madam, in Eden, Im Adam";
        boolean isPalindrome = isPalindrome(str.toLowerCase());
        System.out.println("Result:" + isPalindrome);
    }

    public static boolean isValidChar(Character ch) {
        String str = String.valueOf(ch);
        return str.matches("[a-zA-Z0-9]");
    }

    public static boolean isPalindrome(String s) {
        boolean result = false;
        if (s.isEmpty() || s.length() == 1)
            return true;

        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (!isValidChar(s.charAt(start)) && start < end) {
                ++start;
            }
            while (!isValidChar(s.charAt(end)) && start < end) {
                --end;
            }
            if (s.charAt(start) == s.charAt(end)) {
                ++start;
                --end;
            } else {
                return false;
            }
        }
        return true;
    }


}

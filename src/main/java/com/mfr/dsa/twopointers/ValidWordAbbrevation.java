package com.mfr.dsa.twopointers;

public class ValidWordAbbrevation {

    public static void main(String[] args) {
        boolean result = validWordAbbreviation("subsequences", "3sequ3es");
        System.out.println("Result:" + result);
    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        int wordIndex = 0,  abbrIndex = 0 ;
        char abbrCh = ' ';

        while (abbrIndex < abbr.length()) {
            abbrCh = abbr.charAt(abbrIndex);
            if (abbr.charAt(abbrIndex) == '0') {
                return false;
            }

            if (Character.isDigit(abbrCh)) {
                int num = 0;
                while (abbrIndex < abbr.length() && Character.isDigit(abbrIndex)) {
                    num = (num * 10) + Character.getNumericValue(abbrCh);
                    ++abbrIndex;
                }
                wordIndex += num;
            } else {
                if (wordIndex >= word.length() || word.charAt(wordIndex) != abbr.charAt(abbrIndex)) {
                    return false;
                }
                ++wordIndex;
                ++abbrIndex;
            }
        }
        return wordIndex == word.length() && abbrIndex == abbr.length();

    }


    private static boolean isNumber (char ch) {
        int val = (int)ch;
        return val >=48 && val <=57;
    }

    public static boolean validWordAbbreviationOld(String word, String abbr) {
        int start = 0, end = abbr.length();
        int len = 0;
        while (start < end) {
            char chStart = abbr.charAt(start);
            char chEnd = abbr.charAt(end);

            if (chStart == '0' || chEnd == '0') {
                return false;
            }

            if (chStart == word.charAt(start)) {
                ++start;
            }

            if (chEnd == word.charAt(end)) {
                ++end;
            }

            if (isNumber(chStart)) {
                len = (int) chStart;
                if (len == end + 1) {
                    return true;
                }
            }

            if (isNumber(chEnd)) {
                len = (int) chEnd;
                if (len == end + 1) {
                    return true;
                }
            }
        }

        // Replace the following return statement with your code
        return true;
    }
}

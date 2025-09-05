package com.mfr.dsa.twopointers;

import java.util.HashMap;
import java.util.Map;

public class Strobogrammatic {

    public static void main(String[] args) {
        String num = "7553277523275774342524443432733244275747544375775";
        boolean strobogrammatic = isStrobogrammatic(num);
        System.out.println("strobogrammatic:" + strobogrammatic);
    }

    public static boolean isStrobogrammatic(String num) {
        int start = 0, end = num.length() - 1;
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('0', '0');
        charMap.put('1', '1');
        charMap.put('6', '9');
        charMap.put('8', '8');
        charMap.put('9', '6');

        char startChar, endChar;
        while (start < end) {
            startChar = num.charAt(start);
            endChar = num.charAt(end);

            if (charMap.get(startChar) != null && charMap.get(startChar) == endChar) {
                ++start;
                --end;
            } else {
                return false;
            }
        }
        if (start ==  end) {
            return charMap.get(num.charAt(start)).equals(num.charAt(end));
        }
        return true;
    }
}

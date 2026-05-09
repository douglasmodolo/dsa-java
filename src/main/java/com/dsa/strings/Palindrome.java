package com.dsa.strings;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty())
            return false;

        String lower = str.toLowerCase();
        String reversedStr = StringReversal.reverse(lower);
        return lower.equals(reversedStr);
    }
}

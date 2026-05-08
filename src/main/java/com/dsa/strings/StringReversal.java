package com.dsa.strings;

public class StringReversal {
    public static String reverse(String str) {
        if (str == null || str.isEmpty())
            return "";

        StringBuilder revertedString = new StringBuilder();
        for (int i = str.length()-1; i  >= 0; i--) {
            revertedString.append(str.charAt(i));
        }

        return revertedString.toString();
    }
}

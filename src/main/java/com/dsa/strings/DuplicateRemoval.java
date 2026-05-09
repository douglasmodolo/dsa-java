package com.dsa.strings;

import java.util.HashSet;

public class DuplicateRemoval {

    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty())
            return "";

        HashSet<Character> hash = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray())
        {
            if (!hash.contains(c))
            {
                hash.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}

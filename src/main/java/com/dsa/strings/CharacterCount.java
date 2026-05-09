package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static Map<Character, Integer> count(String str) {
        if (str == null || str.isEmpty())
            return new HashMap<Character, Integer>();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}

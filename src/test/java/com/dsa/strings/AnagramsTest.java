package com.dsa.strings;

import org.junit.jupiter.api.Test;

public class AnagramsTest {

    @Test
    void deveRetornarTrueSeForAnagrama() {
        assert(Anagrams.isAnagram("listen", "silent"));
    }

    @Test
    void deveRetornarFalseParaTamanhosDiferentes() {
        assert(!Anagrams.isAnagram("abc", "abcd"));
    }

    @Test
    void deveRetornarFalseSeHouverStringVazia() {
        assert(!Anagrams.isAnagram("", "a"));
        assert(!Anagrams.isAnagram("a", ""));
    }

    @Test
    void deveRetornarFalseSeHouverStringNull() {
        assert(!Anagrams.isAnagram(null, "a"));
        assert(!Anagrams.isAnagram("a", null));
    }
}

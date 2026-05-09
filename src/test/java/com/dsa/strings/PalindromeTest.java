package com.dsa.strings;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    void deveRetonarSePalindromo() {
        assert(Palindrome.isPalindrome("Ana"));
    }

    @Test
    void deveRetornarFalseSeStringVazia() {
        assert(!Palindrome.isPalindrome(""));
    }

    @Test
    void deveRetornarFalseSeStringNull() {
        assert(!Palindrome.isPalindrome(null));
    }
}

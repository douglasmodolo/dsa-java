package com.dsa.logic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void deveGerarListaFizzBuzz() {
        List<String> list = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(list, FizzBuzz.generate(15));
    }

    @Test
    void deveRetornarProprioNumeroComoString() {
        List<String> list = List.of("1");
        assertEquals(list, FizzBuzz.generate(1));
    }

    @Test
    void deveRetornarFizz() {
        List<String> list = List.of("1", "2", "Fizz");
        assertEquals(list, FizzBuzz.generate(3));
    }


}

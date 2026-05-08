package com.dsa.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReversalTest {

    @Test
    void deveInverterString() {
        assertEquals("salguoD", StringReversal.reverse("Douglas"));
    }

    @Test
    void deveRetonarStringVaziaQuandoStringVazia() {
        assertEquals("", StringReversal.reverse(""));
    }

    @Test
    void deveRetonarStringVaziaQuandoStringNull() {
        assertEquals("", StringReversal.reverse(null));
    }

}

package com.dsa.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateRemovalTest {

    @Test
    void deveRetornarStringSemDuplicatas() {
        assertEquals("ban", DuplicateRemoval.removeDuplicates("banana"));
    }

    @Test
    void deveRetornarStringVaziaQuandoStringVazia(){
        assertEquals("", DuplicateRemoval.removeDuplicates(""));
    }

    @Test
    void deveRetornarStringVaziaQuandoStringNull() {
        assertEquals("", DuplicateRemoval.removeDuplicates(null));
    }
}

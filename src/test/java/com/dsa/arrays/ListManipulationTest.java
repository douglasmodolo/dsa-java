package com.dsa.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListManipulationTest {

    @Test
    void insertDeveRetornarListaComElementoInserido() {
        List<Integer> list = List.of(2, 3, 4);
        int element = 5;
        List<Integer> result = List.of(2, 3, 4, 5);
        assertEquals(result, ListManipulation.insert(list, element));
    }

    @Test
    void insertDeveRetornarListaComElementoSeEnviadaListaVazia(){
        List<Integer> list = new ArrayList<>();
        int element = 1;
        List<Integer> result = List.of(1);
        assertEquals(result, ListManipulation.insert(list, element));
    }

    @Test
    void insertDeveRetornarListaVaziaSeEnviadaListaNull(){
        List<Integer> list = new ArrayList<>();
        assertEquals(list, ListManipulation.insert(null, 1));
    }

    @Test
    void removeDeveRetornarListaComElementoRemovido() {
        List<Integer> list = List.of(2, 3, 4);
        int index = 2;
        List<Integer> result = List.of(2, 3);
        assertEquals(result, ListManipulation.remove(list, index));
    }

    @Test
    void removeDeveRetornarListaVaziaSeIndiceForNegativo(){
        List<Integer> list = List.of(2, 3, 4);
        List<Integer> result = new ArrayList<>();
        assertEquals(result, ListManipulation.remove(list, -1));
    }

    @Test
    void removeDeveRetornarListaVaziaSeIndiceNaoExistirNaLista(){
        List<Integer> list = List.of(2, 3, 4);
        List<Integer> result = new ArrayList<>();
        assertEquals(result, ListManipulation.remove(list, 9));
    }

    @Test
    void removeDeveRetornarListaVaziaSeEnviadaListaVazia(){
        List<Integer> list = new ArrayList<>();
        assertEquals(list, ListManipulation.remove(list, 1));
    }

    @Test
    void removeDeveRetornarListaVaziaSeEnviadaListaNull(){
        List<Integer> list = new ArrayList<>();
        assertEquals(list, ListManipulation.remove(null, 1));
    }


}

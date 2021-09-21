package ru.vsu.amm.java;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @org.junit.jupiter.api.Test
    void insert() {
        List list = new List();
        list.insert(1);
        int expected = 1;
        assert (expected)
    }
}
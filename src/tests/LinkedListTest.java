package tests;

import collections.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ibada1731710 on 2018-03-22.
 */
class LinkedListTest {

    LinkedList<String> test;

    @BeforeEach
    void setUp() {
        test=new LinkedList<>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
    }

    @Test
    void add() {
        test.add("5");
        test.add("6");
        assertEquals("1",test.get(0));
        assertEquals("5",test.get(4));
        assertEquals("6",test.get(5));
        assertEquals(null,test.get(7));
    }

    @Test
    void add1() {
        test.add(0,"5");
        assertEquals("5",test.get(0));
        assertEquals("4",test.get(4));
        test.add(5,"6");
        assertEquals("6",test.get(5));
        test.add(-1,"7");
        assertEquals(null,test.get(-1));
    }

    @Test
    void get() {
        String yolo;
        yolo=test.get(1);
        assertEquals("2",yolo);
    }

    @Test
    void set() {
        test.set(0,"5");
        test.set(-1,"6");
        test.set(3,"7");
        test.set(8,"123");
        assertEquals("5",test.get(0));
        assertEquals("7",test.get(3));
        assertEquals(null,test.get(-1));
        assertEquals(null,test.get(8));

    }

    @Test
    void size() {
        assertEquals(4,test.size());
        test.add("5");
        assertEquals(5,test.size());
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(0,test.size());
        assertEquals(null,test.get(0));

    }

    @Test
    void remove() {
        test.remove(1);
        assertEquals("3",test.get(1));
        assertEquals(null,test.get(3));
        test.remove(0);
        assertEquals("3",test.get(0));
        test.remove(1);
        assertEquals(null,test.get(1));

    }

}
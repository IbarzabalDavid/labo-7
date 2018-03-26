package tests;

import collections.File;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ibada1731710 on 2018-03-22.
 */
class FileTest {
    File<String> test;

    @BeforeEach
    void setUp() {
        test=new File<>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
    }

    @Test
    void add() {
        test.add("5");
        assertEquals(5,test.size());
        test.remove();
        test.remove();
        test.remove();
        test.remove();
        assertEquals("5",test.peek());
    }

    @Test
    void remove() {
        assertEquals("1",test.remove());
        assertEquals("2",test.peek());
    }

    @Test
    void peek() {
        String yolo;
        yolo=test.peek();
        assertEquals("1",yolo);
    }

    @Test
    void clear() {
        assertEquals(4,test.size());
        test.clear();
        assertEquals(0,test.size());
        assertEquals(null,test.peek());
    }

    @Test
    void size() {
        assertEquals(4,test.size());
        test.add("5");
        assertEquals(5,test.size());
        test.peek();
        assertEquals(5,test.size());
        test.remove();
        assertEquals(4,test.size());
        test.clear();
        assertEquals(0,test.size());
    }

}
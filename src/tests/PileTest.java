package tests;

import collections.Pile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ibada1731710 on 2018-03-22.
 */
class PileTest {
    Pile<String> test;

    @BeforeEach
    void setUp() {
        test=new Pile<>();
        test.push("1");
        test.push("2");
        test.push("3");
        test.push("4");
    }

    @Test
    void push() {
        test.push("5");
        assertEquals("5",test.peek());
    }

    @Test
    void pop() {
        assertEquals("4",test.pop());
        assertEquals("3",test.peek());
    }

    @Test
    void peek() {
        String yolo;
        yolo=test.peek();
        assertEquals("4",yolo);
    }

    @Test
    void clear() {
        assertEquals("4",test.peek());
        test.clear();
        assertEquals(null,test.peek());
    }

    @Test
    void size() {
        assertEquals(4,test.size());
        test.push("5");
        assertEquals(5,test.size());
        test.peek();
        assertEquals(5,test.size());
        test.pop();
        assertEquals(4,test.size());
        test.clear();
        assertEquals(0,test.size());
    }

}
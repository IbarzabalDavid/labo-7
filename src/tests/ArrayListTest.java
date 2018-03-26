package tests;

import collections.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ibada1731710 on 2018-03-22.
 */
class ArrayListTest {

    ArrayList<String> test;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test=new ArrayList<String >();
        test.add("aa");
        test.add("bb");
        test.add("cc");
    }

    @org.junit.jupiter.api.Test
    void add() {
        test.add("dd");
        test.add("ee");
        assertEquals("aa",test.get(0));
        assertEquals("dd",test.get(3));
        assertEquals("ee",test.get(4));

    }

    @org.junit.jupiter.api.Test
    void add1() {
        test.add(-1,"qq");
        test.add(0,"zz");
        test.add(4,"pp");
        test.add(22,"yy");
        assertEquals("zz",test.get(0));
        assertEquals("pp",test.get(4));
        assertEquals(null,test.get(22));
        assertEquals(null,test.get(-1));

    }

    @org.junit.jupiter.api.Test
    void set() {
        test.set(0,"mm");
        test.set(2,"jj");
        test.set(5,"nn");
        assertEquals("mm",test.get(0));
        assertEquals("jj",test.get(2));
        assertEquals(null,test.get(5));
    }

    @org.junit.jupiter.api.Test
    void get() {
        String allo=test.get(0);
        assertEquals("aa",allo);
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3,test.size());
        test.clear();
        assertEquals(0,test.size());
    }

    @org.junit.jupiter.api.Test
    void clear() {
        test.clear();
        assertEquals(0,test.size());
        assertEquals(null,test.get(0));

    }

    @org.junit.jupiter.api.Test
    void remove() {
        test.add("dd");
        test.remove(0);
        assertEquals("bb",test.get(0));
        assertEquals(null,test.get(3));
        test.remove(1);
        assertEquals("dd",test.get(1));
        assertEquals(null,test.get(2));
    }

    @org.junit.jupiter.api.Test
    void grow() {
        test.add("4");
        test.add("5");
        test.add("6");
        test.add("7");
        test.add("8");
        test.add("9");
        test.add("10");
        test.add("11");
        assertEquals(11,test.size());
    }

}
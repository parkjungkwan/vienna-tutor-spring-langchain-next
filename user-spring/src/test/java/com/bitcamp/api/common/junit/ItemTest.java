package com.bitcamp.api.common.junit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ItemTest {
    @Test
    void testAdd() {
        Item s = new Item();
       
        Assertions.assertEquals(s.add(4, 3), 7);

    }

    @Test
    void testPrint() {
        Item s = new Item();
        String s3 = s.print();
    System.out.println("-->"+s3);
        String s2 = "Hello";
        Assertions.assertEquals(s.print(), "Hello");

    }
}

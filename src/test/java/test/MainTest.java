package test;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void positiveTest(){
        String test = "Two beEr, Or nOt tWo beeR?";
        System.out.println(test.length());

        int actual = test.length();
        final int expected = 26;
        assertEquals(expected,actual);
    }
}

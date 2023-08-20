package demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Junit4IT {

    @Test
    public void testMultiply() {
        int result = multiply(2, 3);
        assertEquals(6, result);
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}


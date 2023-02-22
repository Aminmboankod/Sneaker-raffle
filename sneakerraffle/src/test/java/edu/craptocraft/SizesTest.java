package edu.craptocraft;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class SizesTest {
    public static String[] sizes = null;

    @BeforeClass
    public static void setup() {

        assertEquals(7, Sizes.values().length);
    }

    @Test
    public void constructorTest() {
        Sizes size = Sizes.CUARENTA;
        assertEquals(Sizes.class, size.getClass());
    }
}
package edu.craptocraft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class SenakerTest {

    Raffle craft;


    @Before
    public void setup() {
        craft = new Sneaker("Nike Craft General Purpose", "Brown", 109.99);
    }



    @Test
    public void constructorTest(){
        assertNotNull(craft);
    }

    @Test
    public void toStringTest(){
        assertEquals("Nike Craft General Purpose\nBrown\n109.99 €\nnull", craft.toString());
    }

    
}

package edu.craptocraft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class SenakerTest {

    Raffle craft;
    Entry entry;
    Entry doubleEntry;
    

    @Before
    public void setup() {
        doubleEntry = new Entry("squan.chy@closet.in");
        entry = new Entry("squanchy@closet.in");
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

    @Test
    public void testRegister() {
        assertEquals(0, craft.getRaffles().size());
        craft.register(entry);
        assertEquals(1, craft.getRaffles().size());

        // Squanchy intenta registrar otra participacion
        // pero el sistema bloquea el registro.
        // El total de participaciones sigue siendo 1
        
        craft.register(entry);
        assertEquals(1, craft.getRaffles().size());

    }



    
}

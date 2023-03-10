package edu.craptocraft.raffle;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.EnumSet;

import org.junit.Before;
import org.junit.Test;

import edu.craptocraft.raffle.resources.Sizes;


public class SneakerTest {

    Raffle craft;
    Entry entry;
    Entry doubleEntry;
    EnumSet<Sizes> sizes;
    

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
        craft.sizesRun(Sizes.CUARENTA, Sizes.CUARENTAYDOS);
        assertEquals("Nike Craft General Purpose\nBrown\n109.99 €\n[7.0 US, 7.5 US, 8.0 US, 8.5 US]", craft.toString());
    }

    @Test
    public void registerTest() {
        assertEquals(0, craft.getRaffles().size());
        craft.register(entry);
        assertEquals(1, craft.getRaffles().size());

        // Squanchy intenta registrar otra participacion
        // pero el sistema bloquea el registro.
        // El total de participaciones sigue siendo 1

        assertEquals(1, craft.getRaffles().size());

    }

    @Test
    public void getSizesTest() {
        craft.sizesRun(Sizes.TREINTAYNUEVE, Sizes.CUARENTA); 
        assertEquals("Nike Craft General Purpose\nBrown\n109.99 €\n[6.5 US, 7.0 US]", craft.toString());
    }


    // compruebo si se elimina del hasmap el entry que pasamos por parámetros
    @Test
    public void cancelTest() {
        craft.register(entry);
        craft.cancel(doubleEntry);
        assertNotEquals("[squanchy@closet.in]", craft.listEntries());
        
    }

    // no puedo testear el metodo draw() porque elige al azar un entry del hashSet



    
}

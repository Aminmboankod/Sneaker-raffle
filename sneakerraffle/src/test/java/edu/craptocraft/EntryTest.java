package edu.craptocraft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.craptocraft.raffle.Entry;
import edu.craptocraft.raffle.Raffle;
import edu.craptocraft.raffle.Sneaker;

public class EntryTest {
    
    Entry entry;
    Raffle craft;

    @Before
    public void setup(){
        craft = new Sneaker("Nike Craft General Purpose", "Brown", 109.99);

        entry = new Entry("squanchy@closet.in");
        entry.setUserName("Squanchy");
        entry.setSize(Sizes.CUARENTA);
        entry.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        entry.setTotal(craft.price());
        entry.payment("squanchy@paypal.com");
    }

    @Test
    public void constructorTest(){
        assertNotNull(entry);
    }
    @Test
    public void toStringTest() {
        assertEquals("email: squanchy@closet.in\nAddress: Nearest closet s/n, 90210, Jerry's House, Via Lactea\nPayment: squanchy@paypal.com\nTotal: 109.99 €", entry.toString());
    }

}

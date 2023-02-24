package edu.craptocraft.payment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PaypalTest {


    Payment paypal;
    private Map<String, Double> users;

    @Before
    public void setup(){
        paypal = new Paypal();
        users = new HashMap<>();
        users.put("squanchy@paypal.com", 200d);
        users.put("birdman@paypal.com", 200d);
        users.put("morty@paypal.com", 200d);
        users.put("summer@paypal.com", 200d);
    }

    @Test
    public void constructorTest(){
        assertFalse(users.isEmpty());
    }

    @Test
    public void autenticationTest(){
        assertTrue(paypal.autentication("summer@paypal.com"));
        assertFalse(paypal.autentication("summmer@paypal.com"));
    }

    @Test
    public void payTest(){

    }

    
}

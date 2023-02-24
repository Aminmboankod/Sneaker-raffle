package edu.craptocraft.payment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PaypalTest {
    
    private Map<String, String> users;

    @Before
    public void setup(){
        users = new HashMap<>();
        users.put("squanchy@paypal.com", "200");
        users.put("birdman@paypal.com", "200");
        users.put("morty@paypal.com", "200");
        users.put("summer@paypal.com", "200");
    }

    @Test
    public void constructorTest(){
        users.put("squanchy@paypal.com", "200");
        users.put("birdman@paypal.com", "200");
        users.put("morty@paypal.com", "200");
        users.put("summer@paypal.com", "200");
        
        assertFalse(users.isEmpty());
    }

    @Test
    public void autenticationTest(){

    }

    @Test
    public void payTest(){

    }

    
}

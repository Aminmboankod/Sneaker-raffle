package edu.craptocraft.payment;

import java.util.HashMap;
import java.util.Map;



public class Paypal implements Payment{

    private final Map<String, String> users;


    public Paypal(){
        users = new HashMap<>();
        users.put("squanchy@paypal.com", "200");
        users.put("birdman@paypal.com", "200");
        users.put("morty@paypal.com", "200");
        users.put("summer@paypal.com", "200");
    }

    public Map<String, String> getUsers(){
        return this.users;
    }

    @Override
    public boolean autentication(String payment) {
        return getUsers().containsKey(payment);
    }

    @Override
    public boolean pay(String payment, Double total) {
        return true;
    }

    @Override
    public String credit(String payment) {
        return "200€";
    }

}

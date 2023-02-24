package edu.craptocraft.payment;

import java.util.HashMap;
import java.util.Map;



public class Paypal implements Payment{

    private final Map<String, Double> users;


    public Paypal(){
        users = new HashMap<>();
        users.put("squanchy@paypal.com", 200d);
        users.put("birdman@paypal.com", 200d);
        users.put("morty@paypal.com", 200d);
        users.put("summer@paypal.com", 200d);
    }

    public Map<String, Double> getUsers(){
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
        return "200";
    }

}

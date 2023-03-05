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


    //en este método de momento aplico la lógica del 
    //cobro al usuario aunque su output sea un booleano.
    @Override
    public boolean pay(String payment, Double total) {
        if (getUsers().get(payment) >= total) {
            getUsers().put(payment, getUsers().get(payment) - total);
            return true;
        } else {
            return false;
        }
        
    }

    @Override
    public String credit(String payment) {
        return getUsers().get(payment).toString();
    }

}

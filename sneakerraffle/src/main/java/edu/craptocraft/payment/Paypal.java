package edu.craptocraft.payment;

import edu.craptocraft.raffle.Entry;

public class Paypal implements Payment{

    private final Entry[] users = {};


    public Paypal(){
        
    }


    @Override
    public boolean autentication(String payment) {
        return true;
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

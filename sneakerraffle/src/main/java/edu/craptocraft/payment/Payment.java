package edu.craptocraft.payment;

public interface Payment {

    boolean autentication(String payment);

    boolean pay(String payment, Double total);

    String credit(String payment);

}

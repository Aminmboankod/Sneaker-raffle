package edu.craptocraft.raffle;

import edu.craptocraft.raffle.resources.Sizes;

public class Entry {

    String email = null;
    String userName = null;
    String address = null;
    Double total = 0d;
    String payment = null;
    Sizes size;

    public Entry(String email) {
        this.email = email;
    }

    // ------Getters-------

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getTotal() {
        return total;
    }

    public String getEmail() {
        return email;
    }

    public Sizes getSize() {
        return size;
    }

    // -------Setters---------- 

    public void setTotal(Double total) {
        this.total = total;
    }

    public void payment(String payment) {
        this.payment = payment;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getPayment() {
        return this.payment;
    }


    // toString refactorizado para usar StringBuilder y así no usar tanta memoria y hacer que sea más eficiente
    
    @Override
    public String toString() {
        StringBuilder entryString = new StringBuilder();
        entryString.append("email: ").append(getEmail()).append("\n")
                    .append("Address: ").append(getAddress()).append("\n")
                    .append("Payment: ").append(getPayment()).append("\n")
                    .append("Total: ").append(getTotal()).append(" €");
        return entryString.toString();
    }

}

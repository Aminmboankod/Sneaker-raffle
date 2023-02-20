package edu.craptocraft;

import java.util.Optional;

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

    public void setTotal(Double total) {
        this.total = total;
    }



    public void payment(String payment) {
        this.payment = payment;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }
    
}

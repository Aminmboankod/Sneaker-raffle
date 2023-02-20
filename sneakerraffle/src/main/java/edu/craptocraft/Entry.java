package edu.craptocraft;

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

    public String getEmail() {
        return email;
    }

    public Sizes getSize() {
        return size;
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

    public String getPayment() {
        return this.payment;
    }

    @Override
    public String toString() {
        return "email: " + getEmail() + "\nAddress: " + getAddress() + "\nPayment: " + getPayment() + "\nTotal: " + getTotal()+" €"; 
    }
}

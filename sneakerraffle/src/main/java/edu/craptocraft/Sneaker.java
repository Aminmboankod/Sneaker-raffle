package edu.craptocraft;



import java.util.EnumSet;


import javax.swing.RowFilter.Entry;

public class Sneaker implements Raffle{

    private String style;
    private String name;
    private Double price;
    public EnumSet<Sizes> sizes;
    


    public Sneaker(String name, String style, double price) {
        this.name = name;
        this.style = style;
        this.price = price;
    }


    public EnumSet<Sizes> getSizes() {
        return this.sizes;
    }

    
    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }



    @Override
    public void sizesRun(Sizes size, Sizes sizes) {
        this.sizes = EnumSet.range(size, sizes);

    }
    

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public void register() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cancel() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Integer totalEntries() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String listEntries() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Entry draw() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return getName() + "\n" + getStyle() + "\n" + getPrice()+ " €\n" + getSizes();
    }
    
}

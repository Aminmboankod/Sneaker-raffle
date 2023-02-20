package edu.craptocraft;



import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Sneaker implements Raffle{

    private String style;
    private String name;
    private Double price;
    public EnumSet<Sizes> sizes;
    public Map<String, String> raffles = new HashMap<>();


    public Sneaker(String name, String style, double price) {
        this.name = name;
        this.style = style;
        this.price = price;
    }


    public Map<String, String> getRaffles() {
        return this.raffles;
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
    public void cancel() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Integer totalEntries() {
        return this.raffles.size();
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


    @Override
    public void register(Entry entry) {
        while (!(getRaffles().containsKey(entry.email) || getRaffles().containsValue(entry.payment))) {
            this.raffles.putIfAbsent(entry.email, entry.payment);
        }
        
    }
    
}

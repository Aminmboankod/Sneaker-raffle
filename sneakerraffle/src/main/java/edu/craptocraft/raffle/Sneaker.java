package edu.craptocraft.raffle;


import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import edu.craptocraft.Sizes;


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
    public List<String> getSizes() {
        List<String> sizesList = null;
        if(this.sizes != null) {
            sizesList = this.sizes.stream()
                                    .map(e -> e.getUSsize())
                                    .collect(Collectors.toList());
        
        }
        return sizesList;
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
    public Integer totalEntries() {
        return this.raffles.size();
    }

    @Override
    public List<String> listEntries() {
        List<String> keys = getRaffles().keySet().stream()
				                        .collect(Collectors.toList());
        return keys;
    }

    @Override
    public Entry draw() {
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


	@Override
	public void register(Entry...entries) {

        for (Entry entry : entries) {
            register(entry);
        }		
	}


    @Override
    public void cancel(Entry entry) {
        getRaffles().remove(entry.email);
    }
    
}

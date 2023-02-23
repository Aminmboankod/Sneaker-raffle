package edu.craptocraft.raffle;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import edu.craptocraft.raffle.resources.Sizes;


public class Sneaker implements Raffle{

    private String style;
    private String name;
    private Double price;
    public EnumSet<Sizes> sizes;
    public Set<Entry> raffles = new HashSet();


    public Sneaker(String name, String style, double price) {
        this.name = name;
        this.style = style;
        this.price = price;
    }


    public Set<Entry> getRaffles() {
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
    public List<Entry> listEntries() {
        List<Entry> listEntry = new ArrayList<>(getRaffles());
        return listEntry;
    }

    @Override
    public Entry draw() {
        Entry[] entriesArray = raffles.toArray(new Entry[0]);
        Random random = new Random();
        int randomIndex = random.nextInt(entriesArray.length);
        return entriesArray[randomIndex];
        
    }

    @Override
    public String toString() {
        return getName() + "\n" + getStyle() + "\n" + getPrice()+ " €\n" + getSizes();
    }


    @Override
    public void register(Entry entry) {
        while (!(getRaffles().contains(entry))) {
            getRaffles().add(entry);
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

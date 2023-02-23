package edu.craptocraft.raffle;


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


    // ------ Getters --------

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

    // ------- Setter -------

    @Override
    public Double price() {
        return this.price;
    }


    // ------ Logic -------

    @Override
    public void sizesRun(Sizes size, Sizes sizes) {
        this.sizes = EnumSet.range(size, sizes);
        
    }

    @Override
    public Integer totalEntries() {
        return this.raffles.size();
    }

    @Override
    public List<String> listEntries() {
        List<String> entryList = null;
        if(this.sizes != null) {
            entryList = getRaffles().stream()
                                    .map(e -> e.getPayment())
                                    .collect(Collectors.toList());
        
        }
        return entryList;
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
        StringBuilder sneakerBuilder = new StringBuilder();
        sneakerBuilder.append(getName()).append("\n")
                      .append(getStyle()).append("\n")
                      .append(getPrice()).append(" €\n")
                      .append(getSizes());
        return sneakerBuilder.toString();
    }


    @Override
    public void register(Entry entry) {

        if (!getRaffles().stream().anyMatch(e -> e.getPayment().equals(entry.getPayment())) &&
            !getRaffles().stream().anyMatch(e -> e.getEmail().equals(entry.getEmail()))) {
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
        getRaffles().remove(entry);
    }
    
}

package edu.craptocraft;

import java.util.Map;

public interface Raffle {
    
    void sizesRun(Sizes size, Sizes sizes);
    Double price();
    void register(Entry entry);
    void cancel();
    Integer totalEntries();
    String listEntries();
    Entry draw();
    Map<String, String> getRaffles();

}

package edu.craptocraft.raffle;

import java.util.List;
import java.util.Map;

import edu.craptocraft.Sizes;

public interface Raffle {
    
    void sizesRun(Sizes size, Sizes sizes);
    Double price();
    void register(Entry entry);
    void cancel();
    Integer totalEntries();
    List<String> listEntries();
    Entry draw();
    Map<String, String> getRaffles();
    void register(Entry...entries);

}

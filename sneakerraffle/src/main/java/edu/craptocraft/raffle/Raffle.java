package edu.craptocraft.raffle;

import java.util.List;
import java.util.Set;

import edu.craptocraft.raffle.resources.Sizes;

public interface Raffle {
    
    void sizesRun(Sizes size, Sizes sizes);
    Double price();
    void register(Entry entry);
    Integer totalEntries();
    List<Entry> listEntries();
    Entry draw();
    Set<Entry> getRaffles();
    void register(Entry...entries);
    void cancel(Entry summer);

}

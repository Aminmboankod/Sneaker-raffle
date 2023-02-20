package edu.craptocraft;

import edu.craptocraft.Entry;


public interface Raffle {
    
    void sizesRun(Sizes size, Sizes sizes);
    Double price();
    void register();
    void cancel();
    Integer totalEntries();
    String listEntries();
    javax.swing.RowFilter.Entry draw();

}

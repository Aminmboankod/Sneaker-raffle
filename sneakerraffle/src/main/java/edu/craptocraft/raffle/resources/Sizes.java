package edu.craptocraft.raffle.resources;

public enum Sizes {

    TREINTAYNUEVE("6.5 US", "39 EU"),
    CUARENTA("7.0 US", "40 EU"),
    CARENTAYMEDIO("7.5 US", "40 1/2 EU"),
    CUARENTAYUNO("8.0 US","41 EU" ),
    CUARENTAYDOS("8.5 US","42 EU" ),
    CUARENTAYDOSYMEDIO("9.0 US", "42 EU"),
    CUARENTAYTRES("9.5 US", "43 EU");

    private String USsize;
    private String EUsize;

    private Sizes(String USsize, String EUsize) {
        this.USsize = USsize;
        this.EUsize = EUsize;
    }

    public String getUSsize(){
        return this.USsize;
    }

    public String getSizes(Sizes USsize, Sizes EUsize){
        return this.USsize + this.EUsize;
    } 

    

    




    
}


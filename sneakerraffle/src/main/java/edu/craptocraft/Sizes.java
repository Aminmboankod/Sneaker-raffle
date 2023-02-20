package edu.craptocraft;

public enum Sizes {

    TREINTAYNUEVE("6.5", "39"),
    CUARENTA("7.0", "40"),
    CARENTAYMEDIO("7.5", "40 1/2"),
    CUARENTAYUNO("8.0","41" ),
    CUARENTAYDOS("8.5","42" ),
    CUARENTAYDOSYMEDIO("9.0", "42"),
    CUARENTAYTRES("9.5", "43");

    private String USsize;
    private String EUsize;

    private Sizes(String USsize, String EUsize) {
        this.USsize = USsize;
        this.EUsize = EUsize;
    }

    public String getUSsize(){
        return this.USsize;
    }

    




    
}


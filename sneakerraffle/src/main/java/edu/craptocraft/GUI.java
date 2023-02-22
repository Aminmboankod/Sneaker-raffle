package edu.craptocraft;

import edu.craptocraft.raffle.Entry;
import edu.craptocraft.raffle.Raffle;

public class GUI {
    
    public GUI(){}

    public static void drawSneaker(Raffle sneaker){

        System.out.println(
        "\t\t" + " _    _" + "\n" +
        "\t\t" + "(_\\__/(,_" + "\n" +
        "\t\t" + "| \\ `_////-._" + "\n" +
        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
        "\t\t" + "|=====;__/___./" + "\n" +
        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +
        "\t\t" + sneaker.toString());
    
    }

    public static void drawEntry(Entry user) {
        System.out.println(user.toString());
    }


}


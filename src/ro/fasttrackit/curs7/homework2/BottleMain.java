package ro.fasttrackit.curs7.homework2;

import java.awt.desktop.SystemEventListener;

public class BottleMain {
    public static void main(String[] args) {

        Bottle bottle = new Bottle(30, 20, "open");
        Bottle bottle1 = new Bottle(20, 20, "closed");

        System.out.println(bottle.openClosed());
        System.out.println("Bottle is "+ bottle.getState()+bottle.closedOpen());
        System.out.println("Increase liquid with " + bottle.getIncLiquid() + "% from the bottle");
        System.out.println("You drink " + bottle.getDecLiquid()+"% from bottle");
        System.out.println("Available liquid " + bottle.isTotalLiquid()+"% from the bottle");
        System.out.println("More liquid " + bottle.isMoreLiquid());
        System.out.println("Empty capacity " + bottle.isEmptyCapacity()+"% from the bottle");
        System.out.println("Bottle is "+ bottle1.getState()+bottle1.closedOpen()+" "+bottle1.openClosed());
        System.out.println("Available liquid " + bottle1.isTotalLiquid()+"% from the bottle");
        System.out.println("More liquid " + bottle1.isMoreLiquid());
        System.out.println("Empty capacity " + bottle1.isEmptyCapacity()+"% from the bottle");
        System.out.println(bottle1.emptyBottle());

    }
}

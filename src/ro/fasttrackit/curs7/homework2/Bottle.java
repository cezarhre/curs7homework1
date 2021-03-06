package ro.fasttrackit.curs7.homework2;

import java.util.Objects;

public class Bottle {
    private int totalLiquid;
    int capacity = 100;
    private int incLiquid;
    private int decLiquid;
    private boolean open;

    public Bottle(int incLiquid, int decLiquid, boolean open) {
        this.incLiquid = incLiquid;
        this.decLiquid = decLiquid;
        this.open = open;
    }

    public int getIncLiquid() {
        return incLiquid;
    }

    public int getDecLiquid() {
        return decLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public int totalLiquid() {
        totalLiquid = totalLiquid - decLiquid + incLiquid;
        return totalLiquid;
    }

    public boolean isMoreLiquid() {
        if (totalLiquid > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int emptyCapacity() {
        int emptyCapacity = 0;
        return emptyCapacity = capacity - totalLiquid;
    }

    public String emptyBottle() {
        if (!isMoreLiquid()) {
            return "The bottle is empty. You have to refill";
        } else {
            return "The bottle has liquid";
        }
    }

    public String openBottle() {
        if (open) {
            return "Bottle is already open";
        } else {
            return "Bottle is open";
        }
    }

    public String closedBottle() {
        if (!open) {
            return "The bottle is already closed";
        } else {
            return "The bottle is closed";
        }
    }
}




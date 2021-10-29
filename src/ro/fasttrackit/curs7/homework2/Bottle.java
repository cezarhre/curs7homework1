package ro.fasttrackit.curs7.homework2;

import java.util.Objects;

public class Bottle {
    private int totalLiquid;
    int capacity = 100;
    private int incLiquid;
    private int decLiquid;
    private String state;

    public Bottle(int incLiquid, int decLiquid, String state) {
        this.incLiquid = incLiquid;
        this.decLiquid = decLiquid;
        this.state = "closed";
    }

    public int getIncLiquid() {
        return incLiquid;
    }

    public int getDecLiquid() {
        return decLiquid;
    }

    public String getState() {
        return state;
    }

    public int isTotalLiquid() {
        int totalLiquid = 0;
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

    public int isEmptyCapacity() {
        int emptyCapacity = 0;
        emptyCapacity = capacity - totalLiquid;
        return emptyCapacity;
    }

    public String emptyBottle() {
        if (!isMoreLiquid()) {
            return "The bottle is empty. You have to refill";
        } else {
            return "The bottle has liquid";
        }
    }

    public String closedOpen() {
        if (getState().equals("closed")) {
            return " you cannot drink";
        } else {
            return " you can drink";
        }
    }

    public String openClosed() {
        if (getState().equals("open")) {
            return "The bottle is already open";
        } else {
            return "Open the bottle";
        }
    }

    public void setState(String newState){
        if(validState(newState)){
            this.state = newState;
        }

    }

    public boolean validState(String newState) {
        return "open".equalsIgnoreCase(newState) || "closed".equalsIgnoreCase(newState);
    }
}




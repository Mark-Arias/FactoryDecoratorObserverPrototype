package ObserverDesignPattern;

public class SmallPartyRoom extends Room {
    private String restrictions;

    /**
     *
     */
    public SmallPartyRoom(String description, int capacity, boolean isAvailable)
    {
        super(description,capacity,isAvailable);
        restrictions = "None";
        this.setCost(150.0);   // Small PartyRoom costs 150/hr
    }


    //----------------------------------------------------------------------------
    // Getters and Setters
    public double getCost(){
        return super.getCost();
    }

    public void setCost(double cost) {
        super.setCost(cost);
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }
}

package ObserverDesignPattern;

public class MediumPartyRoom extends Room  {
    private String restrictions;

    /**
     *
     */
    public MediumPartyRoom(String description, int capacity, boolean isAvailable)
    {
        super(description,capacity,isAvailable);
        restrictions = "None";
        this.setCost(250.0);   // Medium PartyRoom costs 250/hr
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

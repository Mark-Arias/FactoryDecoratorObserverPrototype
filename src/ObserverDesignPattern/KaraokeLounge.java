package ObserverDesignPattern;

/**
 *
 */
public class KaraokeLounge extends Room  {
    private String restrictions;

    /**
     *
     */
    public KaraokeLounge(String description, int capacity, boolean isAvailable)
    {
        super(description,capacity,isAvailable);
        restrictions = "None";
        this.setCost(30);   // Karaoke Lounge costs 30/hr
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

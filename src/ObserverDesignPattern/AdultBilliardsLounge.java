package ObserverDesignPattern;

/**
 * Concrete Subject
 */
public class AdultBilliardsLounge extends Room  {
    private String restrictions;

    /**
     *
     */
    public AdultBilliardsLounge(String description, int capacity, boolean isAvailable)
    {
        super(description,capacity,isAvailable);
        restrictions = "21+ only";
        this.setCost(25);   // Billiards Lounge costs 25/hr
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

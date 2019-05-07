package ObserverDesignPattern;

/**
 * Concrete Subject
 */
public class AquaWorld extends Room  {

    private String restrictions;

    /**
     * Constructor
     * @param description
     * @param capacity
     * @param isAvailable
     */
    public AquaWorld(String description, int capacity, boolean isAvailable)
    {
        super(description,capacity,isAvailable);
        restrictions = "To access water facilities, bathing suits must be worn at all times.";
        this.setCost(700);  // Aqua world costs 700/hr

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

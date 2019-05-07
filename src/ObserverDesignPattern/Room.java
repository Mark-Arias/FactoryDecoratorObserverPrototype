package ObserverDesignPattern;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Base Room Type
 */
public class Room implements Subject
{
    private List<Observer> observers = new ArrayList<>();
    private boolean isAvailable;
    private String description;
    private String amenities;
    private int capacity;
    private double cost;
    private String mealPlan;

    /**
     * Room Constructor
     */
    public Room(String description, int capacity, boolean isAvailable)
    {
        this.description = description;
        this.capacity = capacity;
        this.isAvailable = isAvailable;

    }

    /**
     * Default Constructor
     */
    public Room()
    {
        this.description = "";
        this.capacity = 0;
        this.isAvailable = true;

    }

    //----------------------------------------------------------------------------
    // Section : Methods below responsible for observer implementation
    /**
     * Add a guest to the waitlist for a particular room
     * @param o
     */
    @Override
    public void addToWaitlist(Observer o) {
        observers.add(o);
    }

    /**
     * Notify guest that they will be receiving a room
     * Then remove them from the waitlist
     * @param o
     */
    @Override
    public void removeFromWaitlist(Observer o) {
        contactGuest(o);
        observers.remove(o);
    }

    /**
     * Grants the room to the next guest in the waitlist
     * for a given date
     */
    @Override
    public void contactGuest(Observer o) {
        /*
        for(Observer o: observers) {
            o.finalizeReservation();
        }
        */
        System.out.println("The reservation request went through sucesfully");
        o.finalizeReservation();
    }

    /**
     * Returns true if the room is available, false otherwise
     */
    public boolean isAvailable(Date date)
    {
        for(Observer o : observers)
        {
            if(date == o.getDate())
            {
                return false;
            }
        }
        return true;
    }

    //----------------------------------------------------------------------------
    // Getters and Setters

    public String getMealplan() { return mealPlan;}

    public void setMealplan(String plan) {
        this.mealPlan = plan;
    }
    /**
     *
     * @return
     */
    public String getDescription()
    {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }


    /**
     *
     * @return
     */
    public String getAmenities() {
        return amenities;
    }

    /**
     *
     * @param upgrade
     */
    public void upgradeAmenities(String upgrade) {
        this.amenities = amenities.concat(upgrade);
    }

    /**
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /**
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @return
     */
    public double getCost(){
        return cost;
    }

    public void setCost(double roomCost)
    {
        this.cost = roomCost;
    }


}

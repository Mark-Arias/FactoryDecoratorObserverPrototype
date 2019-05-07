package ObserverDesignPattern;

import Core.Guest;

import java.util.Date;

/**
 * Concrete Observer
 */
public class Reservation implements Observer {


    private Date date;
    private Room room;  // this is the subject
    private Guest guest;
    private boolean isReserved; // track state of room reservations
    private String confirmationNumber;

    /**
     * Constructor
     * @param date
     * @param room
     * @param guest
     */
    public Reservation(Date date, Room room, Guest guest)
    {
        this.date = date;
        this.room = room;
        //this.room.addToWaitList(this);
        this.guest = guest;
        this.isReserved = true; // should this setting be modified here?
        this.confirmationNumber = "010101";
    }

    // Class Getters ----------------------------------------------------------
    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }
    /**
     *
     * @return
     */
    public String getRoom() {
        return room.getDescription();

    }

    // Class Setters ----------------------------------------------------------
    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     *
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * finalize the room reservation by generating a confirmation number
     * and sending confirmation message to guest email in file
     */
    @Override
    public void finalizeReservation() {
        System.out.println("Reservation Information");
        System.out.println("Date : " + date);
        System.out.println("Room: " + getRoom());
    }
}

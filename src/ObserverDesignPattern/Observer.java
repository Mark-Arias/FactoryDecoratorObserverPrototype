package ObserverDesignPattern;

import java.util.Date;

/**
 * Observer Base
 */
public interface Observer {
    public void finalizeReservation();  // update

    public Date getDate();
}

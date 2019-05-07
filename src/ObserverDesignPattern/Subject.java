package ObserverDesignPattern;

/**
 * 'Subject Base'
 */
public interface Subject {
    public void addToWaitlist(Observer o);  // attach
    public void removeFromWaitlist(Observer o); // detach
    public void contactGuest(Observer o); // notifyUpdate
}

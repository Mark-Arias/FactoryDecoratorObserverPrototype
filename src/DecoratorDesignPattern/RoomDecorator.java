package DecoratorDesignPattern;

import ObserverDesignPattern.Room;

public abstract class RoomDecorator {
    protected Room decoratedRoom;

    /**
     *
     * @param decoratedRoom
     */
    public RoomDecorator(Room decoratedRoom)
    {
        this.decoratedRoom = decoratedRoom;
    }


}

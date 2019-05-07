package AbstractFactoryDesignPattern;

import ObserverDesignPattern.Room;
import ObserverDesignPattern.RoomInterface;

/**
 * Abstract Class to build factories for room creation
 */
public abstract class AbstractRoomFactory
{
    static final int AQUAWORLD_MAX_INSTANCES = 1;
    static final int SMALL_PARTY_ROOM_MAX_INSTANCES = 10;
    static final int MEDIUM_PARTY_ROOM_MAX_INSTANCES = 2;
    static final int KARAOKE_MAX_INSTANCES = 10;
    static final int BILLLIARDS_MAX_INSTANCES = 5;


    public abstract Room createRoom(String roomType);

}

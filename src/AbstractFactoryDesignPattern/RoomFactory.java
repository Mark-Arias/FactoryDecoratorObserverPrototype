package AbstractFactoryDesignPattern;

import ObserverDesignPattern.MediumPartyRoom;
import ObserverDesignPattern.Room;
import ObserverDesignPattern.RoomInterface;
import ObserverDesignPattern.SmallPartyRoom;

/**
 * Concrete Factory class builds the generic rooms for the arcade
 * by taking input from client, and building requested design
 */
public class RoomFactory extends AbstractRoomFactory
{
    @Override
    public Room createRoom(String roomType) {
        if(roomType.equalsIgnoreCase("SmallPartyRoom")){
            return new SmallPartyRoom("Room with party tables and chairs, adjacent to arcade",30,true);
        }
        else if(roomType.equalsIgnoreCase("MediumPartyRoom")) {
            return new MediumPartyRoom("Room with party tables and chairs, quick access to arcade",45,true);
        }
        return null;
    }
}

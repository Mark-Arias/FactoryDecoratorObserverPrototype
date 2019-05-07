package AbstractFactoryDesignPattern;

import ObserverDesignPattern.*;

/**
 * Concrete Factory class builds the custom Rooms for the arcade
 */
public class CustomRoomFactory extends AbstractRoomFactory
{

    @Override
    public Room createRoom(String roomType) {
        if(roomType.equalsIgnoreCase("AquaWorld")){
            return new AquaWorld("Olympic-sized pool with water slide, kiddie pool, and large jacuzzi",75,true);
        }
        else if(roomType.equalsIgnoreCase("KaraokeLounge")) {
            return new KaraokeLounge("Enclosed lounge with karaoke machine",10,true);
        }
        else if(roomType.equalsIgnoreCase("AdultBilliardsLounge")) {
            return new AdultBilliardsLounge("Enclosed lounge with pool table",10,true);
        }
        return null;
    }
}

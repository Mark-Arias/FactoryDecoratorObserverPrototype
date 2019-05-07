package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.AbstractRoomFactory;
import AbstractFactoryDesignPattern.CustomRoomFactory;

/**
 * Factory Generator/Producer class creates requested room factories
 */
public class FactoryProducer {
    public static AbstractRoomFactory getFactory(String factoryType)
    {
        if(factoryType.equalsIgnoreCase("RoomFactory")) {
            return new RoomFactory();
        } else if(factoryType.equalsIgnoreCase("CustomRoomFactory")) {
            return new CustomRoomFactory();
        }
        return null;
    }
}

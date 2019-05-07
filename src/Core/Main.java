package Core;

import AbstractFactoryDesignPattern.AbstractRoomFactory;
import AbstractFactoryDesignPattern.FactoryProducer;
import DecoratorDesignPattern.BasicMealPlanDecorator;
import ObserverDesignPattern.AquaWorld;
import ObserverDesignPattern.Room;
import ObserverDesignPattern.RoomInterface;

public class Main {
    public static void main(String [] args)
    {
        System.out.println("CS 277 Final Project");


        // Testing out the use of abstract factories in room creation
        AbstractRoomFactory customRoomFactory = FactoryProducer.getFactory("CustomRoomFactory");
        Room aquaWorldRoom = customRoomFactory.createRoom("AquaWorld");
        System.out.println(aquaWorldRoom.getDescription());
        System.out.println(aquaWorldRoom.getCost());

        System.out.println("End of test");

        //Room aquaWorldBasicMealPlan = new BasicMealPlanDecorator(new Room());


    }
}

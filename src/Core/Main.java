package Core;

import AbstractFactoryDesignPattern.AbstractRoomFactory;
import AbstractFactoryDesignPattern.FactoryProducer;
import DecoratorDesignPattern.BasicMealPlanDecorator;
import DecoratorDesignPattern.BronzeMealPlanDecorator;
import DecoratorDesignPattern.PlatinumMealPlanDecorator;
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

        Room aquaWorldBasicMealPlan = new BasicMealPlanDecorator(aquaWorldRoom);
        System.out.println(aquaWorldBasicMealPlan.getMealPlan());

        System.out.println("Aquaworld after upgrading to the bronze plan");
        aquaWorldBasicMealPlan = new BronzeMealPlanDecorator(aquaWorldBasicMealPlan);
        System.out.println(aquaWorldBasicMealPlan.getMealPlan());

        System.out.println("Aquaworld after upgrading to the Platinum plan");
        Room aquaWorldGold = new PlatinumMealPlanDecorator(aquaWorldBasicMealPlan);
        System.out.println(aquaWorldGold.getMealPlan());


    }
}

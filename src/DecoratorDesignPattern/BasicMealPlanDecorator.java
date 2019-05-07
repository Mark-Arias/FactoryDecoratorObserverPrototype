package DecoratorDesignPattern;

import ObserverDesignPattern.Room;

public class BasicMealPlanDecorator extends RoomDecorator {

    /**
     * @param decoratedRoom
     */
    public BasicMealPlanDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    public void setMealPlan(Room decoratedRoom)
    {
        decoratedRoom.setMealplan("3 XL 1 Topping Pizzas, 3 2l Soda Bottles, Cost $65");
    }
}

package DecoratorDesignPattern;

import ObserverDesignPattern.Room;

/**
 * This Decorator class changes the room so that it has the requested type of meal plan
 */
public class BasicMealPlanDecorator extends Room {

    protected Room room;

    public BasicMealPlanDecorator(Room r)
    {
        this.room = r;
        setMealPlan("Basic Meal Plan");
    }
}

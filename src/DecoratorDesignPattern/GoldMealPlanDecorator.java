package DecoratorDesignPattern;

import ObserverDesignPattern.Room;

/**
 *
 */
public class GoldMealPlanDecorator extends SilverMealPlanDecorator {
    /**
     * @param r
     */
    public GoldMealPlanDecorator(Room r) {
        super(r);
        upgradeMealPlan("Add in some chicken wings");
    }
}

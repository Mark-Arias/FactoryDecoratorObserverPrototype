package DecoratorDesignPattern;

import ObserverDesignPattern.Room;

/**
 *
 */
public class PlatinumMealPlanDecorator extends GoldMealPlanDecorator {
    /**
     * @param r
     */
    public PlatinumMealPlanDecorator(Room r) {
        super(r);
        upgradeMealPlan("2 Ice Creams added");
    }
}

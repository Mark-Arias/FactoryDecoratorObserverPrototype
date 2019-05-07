package DecoratorDesignPattern;

import ObserverDesignPattern.Room;

/**
 * The Decorator Classes stack on top of one another. Each one adds a new layer
 * to what the prior decorator acheived.
 */
public class BronzeMealPlanDecorator extends BasicMealPlanDecorator {

    /**
     *
     * @param r
     */
    public BronzeMealPlanDecorator(Room r) {
        super(r);
        upgradeMealPlan("Salad or BreadSticks");
    }
}

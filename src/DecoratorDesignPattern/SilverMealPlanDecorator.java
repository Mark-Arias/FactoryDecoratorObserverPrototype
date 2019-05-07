package DecoratorDesignPattern;

import ObserverDesignPattern.Room;

/**
 *
 */
public class SilverMealPlanDecorator extends BronzeMealPlanDecorator{

    /**
     * @param r
     */
    public SilverMealPlanDecorator(Room r) {
        super(r);
        upgradeMealPlan("2 Extra Pizzas, plus two extra sodas");
    }
}

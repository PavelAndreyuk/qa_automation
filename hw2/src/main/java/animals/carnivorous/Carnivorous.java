package animals.carnivorous;

import animals.Animal;
import food.Food;
import food.meat.Meat;

public abstract class Carnivorous extends Animal {
    public boolean eat(Food food) {
        if (food instanceof Meat) {
            this.setHungryPoints(this.getHungryPoints() + food.getHungryPoints());
            return true;
        }
        return false;
    }
}

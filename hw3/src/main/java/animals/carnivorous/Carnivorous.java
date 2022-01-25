package animals.carnivorous;

import animals.Animal;
import animals.WrongFoodException;
import food.Food;
import food.meat.Meat;

public abstract class Carnivorous extends Animal {

    @Override
    public boolean eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            this.setHungryPoints(this.getHungryPoints() + food.getHungryPoints());
            return true;
        }
        throw new WrongFoodException();
    }
}

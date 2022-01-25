package animals.herbivore;

import animals.Animal;
import animals.WrongFoodException;
import food.Food;
import food.grass.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public boolean eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            this.setHungryPoints(this.getHungryPoints() + food.getHungryPoints());
            return true;
        }
        throw new WrongFoodException();
    }
}


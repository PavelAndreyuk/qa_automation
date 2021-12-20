package animals.herbivore;

import animals.Animal;
import food.Food;
import food.grass.Grass;

public abstract class Herbivore extends Animal {
    public boolean eat(Food food) {
        if (food instanceof Grass) {
            this.setHungryPoints(this.getHungryPoints() + food.getHungryPoints());
            return true;
        }
        return false;
    }
}


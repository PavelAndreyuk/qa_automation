package animals;

import food.Food;

public abstract class Animal {
    public abstract boolean eat(Food food);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getHungryPoints();

    public abstract void setHungryPoints(int hungryPoints);
}

package animals;

import food.Food;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int hungryPoints = 5;

    public abstract boolean eat(Food food) throws WrongFoodException;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getHungryPoints();

    public abstract void setHungryPoints(int hungryPoints);

    public abstract Size getSize();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return hungryPoints == animal.hungryPoints &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hungryPoints);
    }
}

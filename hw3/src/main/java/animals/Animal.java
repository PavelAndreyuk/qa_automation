package animals;

import food.Food;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int hungryPoints = 5;
    protected Size size;

    public abstract boolean eat(Food food) throws WrongFoodException;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungryPoints() {
        return hungryPoints;
    }

    public void setHungryPoints(int hungryPoints) {
        this.hungryPoints = hungryPoints;
    }

    public Size getSize() {
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

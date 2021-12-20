package animals;

import food.Food;

public abstract class Animal {
    protected int hungryPoints;
    protected String name;

    public abstract boolean eat(Food food);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHungryPoints(){
        return hungryPoints;
    }

    public void setHungryPoints(int hungryPoints){
        this.hungryPoints = hungryPoints;
    }
}

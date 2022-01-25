package food;

public abstract class Food {
    protected String name;
    protected int hungryPoints = 1;

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
}

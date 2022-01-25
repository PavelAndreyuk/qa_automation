package model;

/**
 * Simple class describing a cat.
 * A cat can eat, play, sleep, voice, chase mouse and clean himself.
 * When cat is hungry he can't do things and only asks for food.
 * We can simulate one day of cat's life using {@link #liveAnotherDay()}.
 * */

public class Cat {

    private static int countCats;
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int hungryPoints;

    public Cat() {
        prettiness = 0;
        weight = 0;
        name = "";
        meow = "";
        hungryPoints = 0;
        countCats++;
    }

    public Cat(int prettiness, int weight, String name, String meow, int hungryPoints) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.hungryPoints = hungryPoints;
        countCats++;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public int getHungryPoints() {
        return hungryPoints;
    }

    public void setHungryPoints(int hungryPoints) {
        this.hungryPoints = hungryPoints;
    }

    public static int getCountCats() {
        return countCats;
    }

    public void eat(int extraHungryPoints) {
        this.hungryPoints += extraHungryPoints;
    }

    public void eat(int extraHungryPoints, String food) {
        System.out.println("I like " + food + " now I'm satisfied");
        this.hungryPoints += extraHungryPoints;
    }

    public void eat() {
        eat(1, "milk");
    }

    public boolean play() {
        if (hungryPoints <= 0) {
            System.out.print("I want to eat! ");
            return false;
        }
        System.out.println("Play with me!");
        hungryPoints--;
        return true;
    }

    public boolean sleep() {
        if (hungryPoints <= 0) {
            System.out.print("I want to eat! ");
            return false;
        }
        System.out.println("Tsssss... Im sleepin'");
        hungryPoints--;
        return true;
    }

    public boolean voice() {
        if (hungryPoints <= 0) {
            System.out.print("I want to eat! ");
            return false;
        }
        System.out.println(meow);
        hungryPoints--;
        return true;
    }

    public boolean chaseMouse() {
        if (hungryPoints <= 0) {
            System.out.print("I want to eat! ");
            return false;
        }
        System.out.println("I saw a mouse there");
        hungryPoints--;
        return true;
    }

    public boolean cleanHimself() {
        if (hungryPoints <= 0) {
            System.out.print("I want to eat! ");
            return false;
        }
        System.out.println("I like being clean");
        hungryPoints--;
        return true;
    }

    public void liveAnotherDay() {
        for (int count = 0; count < 24; count++) {
            int randomNumber = (int) (Math.random() * 6 + 1);
            switch (randomNumber) {
                case 1:
                    if (!play()) eat();
                    break;
                case 2:
                    if (!sleep()) eat();
                    break;
                case 3:
                    if (!voice()) eat();
                    break;
                case 4:
                    if (!chaseMouse()) eat();
                    break;
                case 5:
                    if (!cleanHimself()) eat();
                    break;
                case 6:
                    eat();
                    break;
            }
        }
    }
}

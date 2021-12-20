import model.Cat;

public class Application {
    public static void main(String[] args) {
        Cat firstCat = new Cat(5, 10, "Murzik", "meow", 5);

        Cat secondCat = new Cat();
        secondCat.setHungryPoints(5);
        secondCat.setMeow("meh");
        secondCat.setName("Chorniy");
        secondCat.setPrettiness(2);
        secondCat.setWeight(8);

        System.out.println("First cat day: ");
        System.out.println("Hello, my name is " + firstCat.getName() + " and here is my typical day:");
        firstCat.liveAnotherDay();

        System.out.println();

        System.out.println("Second cat day: ");
        System.out.println("Hello, my name is " + secondCat.getName() + " and here is my typical day:");
        secondCat.liveAnotherDay();

        System.out.println();
        System.out.println("Lets compare voices of out cats: ");
        System.out.println("First cat's voice is \"" + firstCat.getMeow() + "\"");
        System.out.println("Second cat's voice is \"" + secondCat.getMeow() + "\"");
        if (firstCat.getMeow().equals(secondCat.getMeow()))
            System.out.println("There is same meows!");
        else
            System.out.println("There is different meows!");

        System.out.println();
        System.out.println("How many cats do we have?");
        System.out.println("There are " + Cat.getCountCats() + " cats here");
    }
}

import animals.*;
import animals.carnivorous.*;
import animals.herbivore.*;
import animals.interfaces.Swim;
import food.grass.*;
import food.meat.*;
import food.*;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Cat cat = new Cat("cat");
        Tiger tiger = new Tiger("tiger");
        Eagle eagle = new Eagle("eagle");

        Duck duck = new Duck("duck");
        Fish fish = new Fish("fish");
        Rabbit rabbit = new Rabbit("rabbit");

        Food blueGrass = new BlueGrass("blue grass");
        Food redGrass = new RedGrass("red grass");
        Food greenGrass = new GreenGrass("green grass");

        Food cowMeat = new CowMeat("cow meat");
        Food chickenMeat = new ChickenMeat("chicken meat");
        Food pigMeat = new PigMeat("pig meat");

        Worker worker = new Worker();
        try {
//            worker.feed(cat, blueGrass); uncomment this line for exception
            System.out.println("Tiger hungry points before eating is " + tiger.getHungryPoints());
            worker.feed(tiger, chickenMeat);
            System.out.println("Tiger hungry point after eating is " + tiger.getHungryPoints());
            worker.feed(eagle, cowMeat);
            worker.feed(duck, redGrass);
            worker.feed(fish, pigMeat);
            worker.feed(rabbit, greenGrass);
        } catch (WrongFoodException ex) {
            ex.message("This animal doesn't eat this food");
        }
        worker.getVoice(cat);
        worker.getVoice(tiger);
        worker.getVoice(eagle);
        worker.getVoice(duck);
        //worker.getVoice(fish); this doesn't compile
        //worker.getVoice(rabbit); also doesn't compile


        Swim[] pond = {tiger, duck, fish};
        for (Swim animal : pond) animal.swim();

        /**
         * Блок тестирования домашней работы №2
         */

        System.out.println("********************************HW2*****************************************");
        Aviary<Carnivorous> mediumAviaryForCarnivorous = new Aviary(Size.MEDIUM);

        mediumAviaryForCarnivorous.add(cat);
        mediumAviaryForCarnivorous.add(tiger);
        mediumAviaryForCarnivorous.add(eagle);
        //mediumAviaryForCarnivorous.add(duck); doesnt compile

        System.out.println(mediumAviaryForCarnivorous.get("cat"));
        System.out.println(mediumAviaryForCarnivorous.get("tiger"));
        System.out.println(mediumAviaryForCarnivorous.get("eagle"));
        System.out.println(mediumAviaryForCarnivorous.get("duck"));

        mediumAviaryForCarnivorous.delete(eagle);

        System.out.println();
        System.out.println(mediumAviaryForCarnivorous.get("cat"));
        System.out.println(mediumAviaryForCarnivorous.get("tiger"));
        System.out.println(mediumAviaryForCarnivorous.get("eagle"));
        System.out.println(mediumAviaryForCarnivorous.get("duck"));
    }
}

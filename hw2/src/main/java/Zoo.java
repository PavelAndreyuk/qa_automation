import animals.carnivorous.*;
import animals.herbivore.*;
import animals.interfaces.Swim;
import food.grass.*;
import food.meat.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
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

        worker.feed(cat, blueGrass);
        System.out.println("Tiger hungry points before eating is " + tiger.getHungryPoints());
        worker.feed(tiger, chickenMeat);
        System.out.println("Tiger hungry point after eating is " + tiger.getHungryPoints());
        worker.feed(eagle, cowMeat);
        worker.feed(duck, redGrass);
        worker.feed(fish, pigMeat);
        worker.feed(rabbit, greenGrass);

        worker.getVoice(cat);
        worker.getVoice(tiger);
        worker.getVoice(eagle);
        worker.getVoice(duck);
        //worker.getVoice(fish); this doesn't compile
        //worker.getVoice(rabbit); also doesn't compile


        Swim[] pond = {tiger, duck, fish};

        for (Swim animal : pond) animal.swim();
    }
}

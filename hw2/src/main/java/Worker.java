import animals.Animal;
import animals.interfaces.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println("Worker feeds " + animal.getName() + " by " + food.getName());
        if (animal.eat(food))
            System.out.println(animal.getName() + " eats " + food.getName());
        else
            System.out.println(animal.getName() + " doesn't eat " + food.getName());
    }

    public void getVoice(Voice animal) {
        animal.voice();
    }
}

package animals;

public class WrongFoodException extends Exception {

    public WrongFoodException() {
    }

    public void message(String message){
        System.out.println(message);
    }
}

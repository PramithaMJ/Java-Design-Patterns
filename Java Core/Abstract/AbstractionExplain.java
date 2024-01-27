
abstract class Car {

    public void playMusic() {
        System.out.println("Play music");
    }

    public abstract void drive();

    public abstract void fly();

}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("Driving...");
    }
}

/**
 * UpdatedWagonR
 */
class UpdatedWagonR extends WagonR {
    public void fly() {
        System.out.println("flying...");
    }

}

/**
 * Abstraction main class
 */
public class AbstractionExplain {

    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}
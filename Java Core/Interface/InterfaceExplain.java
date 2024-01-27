/**
 * interface is by default abstract and public
 * interface can't be instantiated
 * interface can't have constructor
 * interface just show you functionality
 */
interface A {
    // int a; // error. by default public static final
    int a = 5;
    String b = "Hello"; // by default public static final
    // if static then we can access it by interface name

    void show();

    void config();
}

// class to class -> extends
// class to interface -> implements
// interface to interface -> extends

/**
 * X
 */
interface X {

    void run();
}

interface Y extends X {

}

/**
 * B
 * implements is used to implement interface
 * 
 */
class B implements A, X {

    @Override
    public void show() {
        System.out.println("Show");
    }

    @Override
    public void config() {
        System.out.println("Config");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }

}

/**
 * InterfaceExplain
 */
public class InterfaceExplain {

    public static void main(String[] args) {
        // A obj = new A(); // error
        A obj = new B();
        obj.show();
        obj.config();
        // obj.run();// error because run is not in A interface

        X obj1 = new B();
        obj1.run();

        System.out.println(A.a);
        // A.a = 6; // error because a is final
    }
}
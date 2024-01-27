package lazyInitialization;

public class LazyInitializationTest {
    public static void main(String[] arg) {
        LazyInitialization instance1 = LazyInitialization.getInstance();
        LazyInitialization instance2 = LazyInitialization.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}

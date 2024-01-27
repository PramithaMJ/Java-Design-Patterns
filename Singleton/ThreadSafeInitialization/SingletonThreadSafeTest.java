package ThreadSafeInitialization;

public class SingletonThreadSafeTest {

    public static void main(String[] arg) {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
    
}

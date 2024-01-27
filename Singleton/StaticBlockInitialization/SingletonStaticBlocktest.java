package StaticBlockInitialization;
public class SingletonStaticBlockTest {

    public static void main(String [] arg){
        SingletonStaticBloc instance1 = new SingletonStaticBlock.getInstance();
        SingletonStaticBloc instance2 = new SingletonStaticBlock.getInstance();
    }


    System.out.println(instance1);
    System.out.println(instance2);
}
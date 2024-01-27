public SingletonEagerTest{
    public static void main(String[]args){
        SingletonEager eagerInstance1=SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2=SingletonEager.getEagerInstance();

        System.out.println(Instance1);
        System.out.println(Instance2);
    }
}
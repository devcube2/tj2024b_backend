package day12;

public class Singleton {

    private Singleton() {}

    private static class LazyHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.instance;
    }   
}

//public class Singleton {
//    private static class singleInstanceHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    public static Singleton getInstance() {
//        return singleInstanceHolder.INSTANCE;
//    }
//}
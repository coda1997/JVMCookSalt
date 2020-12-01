package chapter3;

public class ReferenceCoutingGC {
    public Object instace = null;
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        ReferenceCoutingGC o1 = new ReferenceCoutingGC();
        ReferenceCoutingGC o2 = new ReferenceCoutingGC();
        o1.instace = o2;
        o2.instace = o1;

        o1 = null;
        o2 = null;

        System.gc();
    }
}

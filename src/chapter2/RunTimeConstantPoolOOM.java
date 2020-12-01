package chapter2;

public class RunTimeConstantPoolOOM {
    public static void main(String[] args) {
        String string1 = new StringBuilder("computer").append(" science").toString();
        System.out.println(string1.intern() == string1);

        String string2 = new StringBuilder("ja").append("va").toString();
        System.out.println(string2.intern() == string2);
    }
}

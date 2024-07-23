package edu.java.lang;


class A {}
class B {
    @Override
    public String toString() {
        return "class B";
    }
}

public class ObjectMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a);
//        System.out.println(a.toString());
//        System.out.println(b);
        System.out.println(b.toString());
        System.out.println();

        System.out.println("문자열의 값 비교 ==");
        String sa = "haha";
        String sb = "haha";
        String sc = new String("haha");
        String sd = new String("haha");
        System.out.println("equals: " + sa.equals(sb));
        System.out.println("equals: " + sb.equals(sc));
        System.out.println("equals: " + sc.equals(sd));


        System.out.println();
        System.out.println("hash code () ====");
        System.out.println(sa.hashCode());
        System.out.println(sb.hashCode());
        System.out.println(sc.hashCode());
        System.out.println(sd.hashCode());


        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

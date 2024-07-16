package edu.java.basic;

public class Java_0716_Variable {
    public static void main(String[] args) {
        System.out.println("Hello World");


        boolean tf = true;
        char c = 'a';
        tf = 1<0;
        tf = true;
        tf =false;
        c = 66;
        tf = true;
        System.out.println(tf);
        System.out.println(c);

        int s;
        int i = 20;
       s = Hello.sum(i, 10);
        System.out.println((s));


        int eng = 80;
        int com = 75;
        int korea = 90;

        double sum = 0;
        double avg = 0;
        String name = "kim kang min";
        sum = eng + com + korea;
        avg = sum / 3;

        System.out.println("name is" + name);
        System.out.println("eng is" + eng);
        System.out.println("com is" + com);
        System.out.println("korea is" + korea);
        System.out.println("sum is " + sum);
        System.out.println("avg is " + avg);


        var guess = -1;
        var guess2 = "adasdadasdas";

        // 상수 선언의 경우 final 을 앞에 선언한다.
        final double  PI = 3.14;


    }

    // Hello 클래스는 Java_0716 클래스의 멤버 클래스
    public static class Hello {
        public static int sum(int n, int m) {
            return  n+m;
        }
    }
    public static class Score {
        public static int sum(int n, int m, int s) {
            return n+m+s;
        }
    }
}

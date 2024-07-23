package edu.java.lang;

public class Wrapper {
    public static void main(String[] args) {
        // 기본 자료형 < ==== > 참조 자료형
        Double d = 0.123;
        d = Double.valueOf(0.123);

        Integer itg = 123;
        int i = itg;
        i = itg.intValue();

//        i = "456";
//        i = "사오"
          i = Integer.parseInt("456");
//        i = Integer.parseInt("사오");
        String str = String.valueOf(1);
        str = 1 + " ";
        str = Integer.toString(65);

        System.out.println(Integer.MAX_VALUE + "   ~   " + Integer.MIN_VALUE);

        System.out.println( Double.isInfinite(5/0.0));
        System.out.println( Double.isNaN(5%0.0));

    }
}

package edu.java.oop;


// singleTone
// - 하나의 프로그램에서 인스턴스가 하나만 존재해야 하는 경우 사용

// 현재 클래스의 객체를 한 개만 생성하여 모든 객체가 공유하여 사용 할 수  있도록 구현
public class Singleton {
    private static  Singleton instance;
       private Singleton() {  };


       public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
           return instance;
       }

//   Singleton Singleton2() {
//   static int a = 1;
//   static int b() {
//            System.out.println("Inside Singleton");
//            return 1;
//        }
//    }


}

/*

* */

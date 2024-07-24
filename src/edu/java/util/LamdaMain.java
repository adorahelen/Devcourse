package edu.java.util;

 class CLASSA extends Thread {
     public void run() {
         System.out.println("Class A run");
     }
 }
 class CLASSB implements Runnable {
     @Override
     public void run() {
         System.out.println("Class B run");

     }
 }

public class LamdaMain {
     public static void main(String[] args) {
//        CLASSA a = new CLASSA();
//        a.start();
//
//        CLASSB b = new CLASSB();
//        Thread t1 = new Thread(a);
//        t1.start();
//
//        new Thread(a).start();

         System.out.println("5. 참조변수가 있는 익명의 객체로 Thread 구현 ");
         Thread t2 = new Thread(){
             public void run() {
                 System.out.println("Thread 2 run");
             }
         };
         t2.start();


         System.out.println("6. 참조변수가 없는 객체로 Runnable 구현");
         new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("Thread RUN run");
             }
         }).start();


         new Thread( () -> System.out.println("Thread RUN LamDArun")).start();


     }
}

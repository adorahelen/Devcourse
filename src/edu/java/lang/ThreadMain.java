package edu.java.lang;


//1. Thread 클래스를 상속받는 ThreadExtends 클래스 -----
//1.1 기본생성자 오버로딩
//1.2 문자열을 매개변수로 받는 생성자를 오버로딩하여
//넘겨받은 값을 부모 생성자에게 전달
//1.3 부모 메서드를 오버라이딩하여 다음을 스레드로 처리
//스레드의 이름과 1 ~ 3출력

//2. Runnable 인터페이스를 구현하는 ThreadImpl 클래스 -----
//1.1 부모 메서드를 오버라이딩하여 다음을 스레드로 처리
//        //스레드의 이름과 4 ~ 6출력
//class ThreadExtends extends Thread {
//    public ThreadExtends() {}
//
//    public ThreadExtends(String name) {
//        super(name);
//        System.out.println("ThreadExtends");
//    }
//
//
//}
//
//public class ThreadMain {
//    public static void main(String[] args) {
//
//        System.out.println("---main () begin ---");
//
//        ThreadExtends t1 = new ThreadExtends("고현주");
//        int count = 0;
//
//        System.out.println( "실행 중인 쓰레드 이름 : " + t1.getName());
//        System.out.println("---main () end ---");
//
//    }
//}
// 1. Thread 클래스를 상속받는 ThreadExtends 클래스
class ThreadExtends extends Thread {
    // 1.1 기본 생성자
    public ThreadExtends() {
        super();
    }

    // 1.2 문자열을 매개변수로 받는 생성자
    public ThreadExtends(String name) {
        super(name);
    }

    // 1.3 run 메서드를 오버라이딩하여 스레드의 이름과 1 ~ 3을 출력
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        // 기본 생성자를 사용한 스레드 생성 및 시작
        ThreadExtends thread1 = new ThreadExtends();
        thread1.setName("Thread1");
        thread1.start();

        // 문자열을 매개변수로 받는 생성자를 사용한 스레드 생성 및 시작
        ThreadExtends thread2 = new ThreadExtends("Thread2");
        thread2.start();
    }
}

// 2. Runnable 인터페이스를 구현하는 ThreadImpl 클래스
class ThreadImpl implements Runnable {
    // 2.1 run 메서드를 오버라이딩하여 스레드의 이름과 4 ~ 6을 출력
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 4; i <= 6; i++) {
            System.out.println(currentThread.getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        // Runnable 구현체를 사용한 스레드 생성 및 시작
        ThreadImpl runnable = new ThreadImpl();
        Thread thread1 = new Thread(runnable, "RunnableThread1");
        thread1.start();

        // 다른 스레드 생성 및 시작
        Thread thread2 = new Thread(runnable, "RunnableThread2");
        thread2.start();
    }
}
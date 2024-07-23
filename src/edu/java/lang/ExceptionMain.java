package edu.java.lang;

class SamChoException extends Exception {
    public SamChoException(String message) {
        super(message);
    }
}

public class ExceptionMain {

    public static void  CountDown(int count) throws InterruptedException, SamChoException {

        // 사용자 정의
        if (count < 3) {
            throw new SamChoException("카운트 다운은 3초 이상으로 지정해라");
        }


        for (int i = count; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws SamChoException {
        try {
            CountDown(2); }
        catch (InterruptedException e) {
            System.out.println("사용자 정의 예외 발생");
            System.err.println("예외 메시지 : " + e.getMessage());
        }
            System.out.println("-----------");



//        try {
//
//            System.out.println(5/0);
//            System.out.println("1. Before occur exception");
//            System.out.println(args[2]);
//            System.out.println("2. After occur exception");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("3. ArrayIndexOutOfBoundsException");
//        } catch (NullPointerException e) {
//            System.out.println("4. NullPointerException");
//        } catch (Exception e) {
//            System.out.println("5. Exception in The best ");
//        } finally {
//            System.out.println("6. Finally, always run");
//        }

    }
}

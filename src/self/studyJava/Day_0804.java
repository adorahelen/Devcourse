package self.studyJava;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day_0804 {
    public class E {

    } // 리스트들 선언을 위한 임시 객체 == 클래스

    public static void main(String[] args) {
        // 어레이 리스트 & 링크드 리스트
//        List<E> list = new ArrayList<E>(); // E에 지정된 타입의 객체만 저장
//        List<E> list2 = new ArrayList<>(); // E에 지정된 타입의 객체만 저장
//        List list3 = new ArrayList(); // 모든 타입의 객체를 저장가능
//
//        // 배열이기 때문에 삽입 삭제가 활발하게 일어나는 경우 좋지 않다. (자동으로 당겨짐)
//
//        // 링크드 리스트는 사용방법은 동일하지만, 내부 구조는 완전히 다르다.
//
//        List<E> List = new LinkedList<E>();
//        List<E> List2 = new LinkedList<>();
//        List List3 = new LinkedList();

        List<String> listOfArray = new ArrayList<String>();
        List<String> listOfLinked = new LinkedList<String>();

        long startTime;
        long endTime;

        // 배열에 저장하는 시간 코드
        startTime = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            listOfArray.add(0, String.valueOf(i));
        }endTime = System.nanoTime();
        System.out.println("배열 컬렉션에 저장하는 시간을 측정한 결과 : ");
        System.out.println(endTime - startTime);
        System.out.println("====================================");

        // 링크드에 저장하는 시간 코드
        startTime = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            listOfLinked.add(0, String.valueOf(i));
        }endTime = System.nanoTime();
        System.out.println("연결 리스트 컬렉션에 저장하는 시간을 측정한 결과 : ");
        System.out.println(endTime - startTime);

        // 책에서는 4배 차이 였는데, 나는 5배나 차이나네 ㅎㅎ
//        배열 컬렉션에 저장하는 시간을 측정한 결과 :
//        5615333
//                ====================================
//        연결 리스트 컬렉션에 저장하는 시간을 측정한 결과 :
//        1352167


    }

    // 객체 삽입 시간 측정 하기!


}

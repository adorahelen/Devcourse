package edu.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) throws ParseException {


        Date date = new Date();
        Date currentDate = new Date(System.currentTimeMillis());

        System.out.println(date);
        System.out.println(currentDate.toLocaleString());

        SimpleDateFormat fmt =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Date --> String
        String str = fmt.format(date);
        System.out.println(str);

        date = fmt.parse("2024-07-24 15:20:11");
        System.out.println(date);

        // 결국 함수 싸움, 누가 더 이미 구현되어 있는 것을 많이 알고 있냐에 차이
//        Calendar cal = new Calendar() {
//        } 추상화 클래스 이므로 객체 생성 불가
        Calendar cal = Calendar.getInstance(); // 이런식으로 사용함

        System.out.println( cal.get( Calendar.YEAR)  );


        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        System.out.println(ld.getYear());
        System.out.println("윤년 ? " + ld.isLeapYear());
        System.out.println();
// 객체지향이 끝나면 무슨 클래스에 무슨 메소드가 있는지,
        // 챗지피티에게 얼마나 날카롭게 질문을 할 수 있는지가 앞으로 중요함

        ld = LocalDate.of(2000, 10, 11);
        lt = LocalTime.of(11, 22, 33);
        ldt = LocalDateTime.of(2000, 10, 11, 22, 33);
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        ld = LocalDate.parse("2000-11-22");



    }
}

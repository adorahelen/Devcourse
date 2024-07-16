package self.studyJava;

import java.awt.*;
import java.util.Scanner;
import java.util.Vector;

public class Day_0716 {
    public static void main(String[] args) {
        // byte, short, int, long => integer
        // float, double => Real number
        boolean a = true;
        char b = 'A';
        byte c = 'B';
        short d = 'C';
        int e = 'D';
        long f = 'E';
        float g = 'F';
        double h = 'H';
        String i = "I";
        System.out.println(i);
        // 자바에서 문자열은 기본 타입에 속하지 않는다.
        // String class를 이용한다. (JDK에서 제공)

        //  변수 선언
        int price;
        int price1, price2, price3;
        char c1, c2, c3;
        // 리터럴이란 프로그램에 직접 표현한 값을 말한다.
        // 15, 015, 0x15, 0b0101

        final double m = 0.1234;
        double n = 1234E-4;
        System.out.println(g);
        float v = 0.1234f;
        float num = 0.2f;
        // float 는 뒤에 f  없으면 에러, double은 그런거 없음
        // 논리 리터럴의 경우에는 true or false, 1 < 0 , 2 > 0

        String str = null; //가능
//        int we = null; 불가능
        String str1 = "GOOOOOOD";

        var var1 = 200;
        var var2 = "Kitai";
        var pi = 3.14;
        var point = new Point();
        var vq = new Vector<Integer>();
        System.out.println(v);

        byte qwe = 127;
        int iiii = 100;
        // 강제 형 변환 casting
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((byte)(qwe+iiii));
        System.out.println(2.9+1.8);
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9+1.8));
        System.out.println((int)2.9 + (int)1.8);

        Scanner scanner = new Scanner(System.in);
        Scanner DCU = new Scanner(System.in);
        Scanner Sogang = new Scanner(System.in);

        String name1 = Sogang.next();
        int age = Sogang.nextInt();
        double weight = scanner.nextDouble();
        boolean Signal = DCU.nextBoolean();

        //파이썬이 무조건 문자열로 읽어오기 때문에, 형변환을 그 이후에  수행한 반면
        // 자바는 토큰을, 자신이 사용한 스캐너 메소드에 따라 리턴한다
        String kagnmin = DCU.next();
        int name2 = DCU.nextInt();
        String kangminmin = scanner.nextLine();
        // '\n' 을 포함하는 한 라인을 읽고 줄바꿈을 버린 나머지 문자열을 리턴
        final int MAX = 1;

        // 강제 형변환에서 작은 타입에서 큰 타입은 별도의 캐스팅이 필요없지만.
        // 큰 타입에서 작은 타입으로 대입할때는 (형변환)이 필요하다.

        String next() : token return to string type;
        nextByte() : token return to byte type;
        nextShort() : return to short type;
        nextInt() : return to int type;
        nextLong()
        nextFloat()
        nexttDouble()
        nextBoolean()
        nextLine()
        void close() ==> end of scanner;
        DCU.hasNext();
        => 현재 입력된 토큰이 있으면 참/ 아니면 입력 때까지 무한정 대기,
                새로운 입력이 들어올 때 참 / 컨트롤 제트 입력되면 끝이므로 거짓리턴;

        nextLine() 은 Enter 입력을 기다리는 용도로도 사용할 수 있다.
        *개발자는 응용프로그램 전체에 하나의 스캐너 객체만을 생성하고 공유하는 것이 바람직함
                상기 본인이 작성한 코드처럼 스캐너 + 디씨유 + 서강은 좋지 않음


                ;

        연산자의 경우 산술 대입 비교 논리 증감 등등
                * 논리연산자 중에서 엔드, 올, 낫 말고
                !a is not
                a || b this is a or b == +
                a && b this is a and b ==  *
        ***     a ^ b : a 와 b 가 서로 다르면 참 ( xor 연산)
                    => 각각의 참 거짓이 다르게 나오면 참
                    => 둘다 동일한 결과가 나오면 거짓
                    => true ^ true : false



    }
}

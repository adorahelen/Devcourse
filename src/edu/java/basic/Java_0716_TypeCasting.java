package edu.java.basic;

public class Java_0716_TypeCasting {
    public static void main(String[] args) {
        // 스트링으로 읽어 들인다, 알규먼트는 하나씩

        byte one = 1;
        byte two = 2;
        byte three = (byte)(one + two);
        int three2 = one + two;

        int oneMil = 1000000;
        int twoMil = 2000000;
        int lalal = 1000000;
        long roror = 2000000;

        long oneLong = lalal * roror;
        long oneMilLong = (long)1000000 * 2000000;

        System.out.println(oneMilLong);
        System.out.println(oneLong);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
//  변수에 값을 대입할 때
// 피연산자의 타입이 같아야 연산 가능
// 연산 전에 피연사자들의 타입을 일치시킴
// 자료형끼리의 연산에 주의해야한다! 연산이 안되거나 값 손실이 일어날 수 도 있음

// 자동형변환 업 캐스팅. jmv 내부에서 수행
// byte, short, char  -> int -> long , float , double
// 데이터 타입이 다른 경우. 표현 범위가 넓은 쪽에 맞춰 변환된 후 연산 수행
// int + float >>> float + float >>> 결과적으로는 float
// int + long >>> long + long >>> long

// 반대로 다운 캐스팅의 경우
// 범위가 작은 자료형으로 바꿀때, 값 손실 발생이 가능하다. (소수점)

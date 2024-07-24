package edu.java.util;

import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class MethodRed {
    public static void main(String[] args) {
        // Math 클래스의 정적 메서드 max를 직접 호출하여 두 수의 최댓값을 출력합니다.
        System.out.println(Math.max(1, 2));

        System.out.println("1. 정적 메서드 참조 ");

        // 람다 표현식을 사용하여 IntBinaryOperator 인터페이스 구현
        IntBinaryOperator ibo = (x, y) -> Math.max(x, y);

        // 메서드 참조를 사용하여 위 람다 표현식과 동일한 기능 구현
        ibo = Math::max;

        // ibo.applyAsInt를 사용하여 두 수 중 큰 값을 출력
        System.out.println("3 vs 4 : " + ibo.applyAsInt(3, 4));

        // 람다 표현식을 사용하여 ToIntFunction 인터페이스 구현
        ToIntFunction<String> tif = (x) -> Integer.parseInt(x);

        // tif.applyAsInt를 사용하여 문자열을 정수로 변환하여 출력
        System.out.println("123 : " + tif.applyAsInt("123"));


    }
}
// 결론은 메서드 참조가 람다보다도 더 간략하고 축약된 :: 것이다
package edu.java.basic;
import edu.java.oop.Car;


public class CarProtected extends Car {
    public CarProtected() {
        // edu.java.oop 패키지의 Car를 참조하는 변수 new Car 를 샹송

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.Color = "silver";
//프로텍티드도 상속을 받으면 쓸 수 있지만 아무것도 붙이지 않은 *접군제자 없는 애들은 사용이 안댐
        CarProtected carProtected = new CarProtected();
        carProtected.Color = "red";
        carProtected.SunRoof = true;


    }
}

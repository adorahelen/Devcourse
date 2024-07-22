package edu.java.oop;

public class ElectricCar extends Car {
    private int battery;
    private Tire front, Right, Left, back;
    private Tire[] tires;

    public ElectricCar(int battery, Tire front, Tire right, Tire left, Tire back) {
        this.battery = battery;
        this.front = front;
        Right = right;
        Left = left;
        this.back = back;

        front.attachTire();
        right.attachTire();
        left.attachTire();
        back.attachTire();

    }

//    public ElectricCar(Tire[] tires) {
//        this.tires = tires;
//        for (int i = 0; i < tires.length; i++) {
//            tires[i].attachTire();
//        }
//    }

    public ElectricCar(int battery, Tire ... tires) {
        this.battery = battery;
        this.tires = tires;

        for (Tire tire : tires) {tire.attachTire();}


    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public ElectricCar(){
        // super(); =>  부모 기보 생성자 호출 생략
        System.out.println("Electric Car Constructor");
    }

    //  부모 클래스의 메서드 재정의 - 오버 라이딩
    @Override
    public String toString() {
        return "ElectricCar 객체 : 색상- " + Color +
                " 썬루프 -" + SunRoof +
                "가격-" + price +
                "제조사-" +  getMaker() + " battery " + battery;//super.maker;

        // 상속을 받아도 쓸 수 없음 그래서
    }
}

package edu.java.oop;
// 마이너스는 프라이베이트, 플러스는 퍼블릭


// 메서드 오버로딩 : 동일한 메서드 이름을 사용하지만
//          매개변수의 수나 타입이 다른 여러 메서드를 정의
// 메서드 오버라이딩 : 상위 클래스에서 정의된 메서드를 하위 클래스에서
//           재정의하여 사용할 수 있게 한다.
public class DeskLamp {
    private boolean power = false;
    private int brightness = 0;

    // 기본 생성자 정의
    public DeskLamp() {
        System.out.println("DeskLamp Constructor");

    }

    // 오버로딩된 생성자 정의
    public DeskLamp(boolean power) {
        //  불리안 자료형의 파워라는 매개 변수를 가지고 실행되는
        // 생성자를 정의하고 있습니다.

        this.power = power;
        System.out.println("DeskLamp Constructor2");
    }

    // 오버로딩된 생성자 ver.2
    public DeskLamp(boolean power, int brightness) {
        this.power = power;
        this.brightness = brightness;
        System.out.println("DeskLamp Constructor3");
    }
    // - - - - - - - - - - - - - - - - -
    public void powerOn() {
        power = true;
    }

    public void powerOff() {
        power = false;
    }
    //   내가 작성한 이 밝기 설정 메서드 (오버로딩)
    public void setBrightness(int brightness) {
        if (brightness == 1 || brightness == 2 || brightness == 3) {
            this.brightness = brightness;
        }
        else System.out.println("Invalid brightness, choose from 1 or 2 or 3" );

    }
    // 위에 같은 이름의 함수(메소드)이지만
    // 이름이 같지만 서로 다르게 동작하는 메소드
    // 를 여러개 민드는 것이 바로 메소드 오버로딩 이다.'

    // 클래스 내에서 이름이 같지만 서로 다르게 동작하는 메소드를
    // 여러개 만드는 메소드 오버로딩
    public void setBrightness(String level) {
        switch (level.toLowerCase()) {
            case "low":
                this.setBrightness(1);
                break;
            case "medium":
                this.setBrightness(2);
                break;
            case "high":
                this.setBrightness(3);
                break;
            default:
                System.out.println("Invalid brightness, choose from 1 or 2 or 3" );

        }

    }
    //
    public int getBrightness() {
        return brightness;
    }
    // 이게 메소드 오버라이딩인데
    // 상위 클래스에서 구현된 메소드를 하위 클래스에서 동일한 이름으로
    // 자신의 특징에 맞게 다시 구현하는 이른바 메소드 오버라이딩
    @Override
    public String toString() {
        return "Power: " + power + " Brightness: " + brightness;
    }
}

// 둘다 메소드의 내용은 달라지지만
// 오버로딩은 같은 클래스내에서 동일한 이름으로 다른 동작을
// 오버라이딩은 상위클래스에서 하위클래스로 가지고 와서 바꾼다.
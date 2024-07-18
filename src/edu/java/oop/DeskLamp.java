package edu.java.oop;
// 마이너스는 프라이베이트, 플러스는 퍼블릭

public class DeskLamp {
    private boolean power = false;
    private int brightness = 0;

    public void powerOn() {
        power = true;
    }
    public void powerOff() {
        power = false;
    }
    public void setBrightness(int brightness) {
        if (brightness == 1 || brightness == 2 || brightness == 3) {
            this.brightness = brightness;
        }
        else System.out.println("Invalid brightness, choose from 1 or 2 or 3" );

    }
    //
    public int getBrightness() {
        return brightness;
    }

    @Override
    public String toString() {
        return "Power: " + power + " Brightness: " + brightness;
    }
}

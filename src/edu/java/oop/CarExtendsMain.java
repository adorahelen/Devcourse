package edu.java.oop;
public class CarExtendsMain {
    public static void main(String[] args) {

        ElectricCar ec = new ElectricCar();
        System.out.println(ec);
        ec.Color = "black";
        ec.price = 1000;
        ec.setMaker("KIAS");
        System.out.println(ec);
        ec.setBattery(100);
        System.out.println(ec);
    }
}
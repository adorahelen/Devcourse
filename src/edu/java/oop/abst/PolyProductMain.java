package edu.java.oop.abst;

class Product {
    String name;
    int price;
}
class TV extends Product {}
class Monitor extends Product {}
class Audio extends Product {}

class Buyer {
    public void buy(TV a) {
        System.out.println("TV buys " + a.name);
    }
    public void buy(Monitor a) {
        System.out.println("Monitor buys " + a.name);
    }
    public void buy(Audio a) {
        System.out.println("Audio buys " + a.name);
    }

    // 매개 변수의 다형성
public void buy(Product p){
        System.out.println("Product buys " + p.getClass().getSimpleName());
}// 메소드 체인

}


public class PolyProductMain {
    public static void main(String[] args) {

        Buyer b = new Buyer();

        TV a = new TV();
        Monitor m = new Monitor();
        Audio audio = new Audio();

        b.buy(a);
        b.buy(m);
        b.buy(audio);

        System.out.println("---------");
        Product p = new Product();
        p = a; b.buy(p);
        p = m; b.buy(p);
        p = audio; b.buy(p);


    }
}

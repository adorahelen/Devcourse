package self.studyJava;

public class Carr {


    String color;
    String sunloof;
    int price;
    String maker;

    public Carr() {
        System.out.println();
    }

    public Carr(String color) {

        this.color = color;
        System.out.println(color);
    }

    public Carr(String color, String maker, String sunloof, int price) {
        this(); // 기본 생성자 호출
        this.color = color;
        this.sunloof = sunloof;
        this.price = price;
        this.maker = maker;
        System.out.println();
    }

}
package edu.java.oop;

public class Callbyreferance {

    //  객체를 저장하는 배열 연습
    // Pizza 객체를 배열로 념겨받는 인스턴스 매서드 printPizza()
    // 반화값 : x
    // 기능 : 배열로 넘겨받은 객체의 값을 다음처럼 화면의 출력
   static public void PrintPizza(Pizza[] pizaas) {
        System.out.println("--- Pizza Order LIst ---");
        System.out.println("no.\t\t피자 이름\t크기");

        for (int i = 0; i < pizaas.length; i++) {
            System.out.println((i+1) +"\t\t"
            + pizaas[i].name
                    + "\t\t" +
                    pizaas[i].radius

            );
        }
        System.out.println("-----------------");
        System.out.println("총 주문 수량 : " + pizaas.length);

    }





//    public static void printPizza() {
//        System.out.println("--- Pizza Order LIst ---");
//        System.out.println("no.   피자 이름    크기");
//
//        class Pizza {
//            String num;
//            String name;
//            String size;
//        }
//
//        Pizza arrays1[] = new Pizza{"1", "as", "s"};
//    }
    public static void main(String[] args) {


// 콜바이 래퍼런스는 객체를 넘기거나 배열을 넘기거나 하는 경우
        // 콜바이 벨류는 기본 자료형 넘 길때
        // 이게 좌지우지 되는건 그 자료 형 어떻게 설정했는지 , 함수 앞에

        int medium = 15;
        int Large = 200;

        Pizza p1 = new Pizza("새우피자", medium);
        Pizza p2 = new Pizza("감자피자", Large);
        Pizza p3 = new Pizza("치즈피자", Large);

        Pizza[] pizzas = new Pizza[3];
        pizzas[0] = p1;
        pizzas[1] = p2;
        pizzas[2] = p3;

//        Callbyreferance c = new Callbyreferance();
//        c.PrintPizza(pizzas);

        PrintPizza(pizzas);


//        //p1 , p2 객체를 매개변수로 전달하면 라디우스 가 더 큰 피자 객체를 반환하는
//        // 메서드를 호출하여 반환되는 값을 임의의 변수에 저장
//
//        System.out.println(p1);
//        System.out.println(p2);
//         Pizza largePizza = Pizza.getLargePizza(p1, p2);
//        System.out.println("새우 피자의 크기 " + p1.radius);
//        System.out.println("감자 피자의 크기 " + p2.radius);
//        System.out.println(largePizza);
//        System.out.println(" 둘 중 더 큰 피자 " + largePizza.name);
//
//        System.out.println("---------");
//        System.out.println(" Make the Large Pizza  !");
//        Pizza.makelargePizza(p1, Large);
//        Pizza.makelargePizza(p2, Large);
//        System.out.println("새우 피자의 크기 " + p1.radius);
//        System.out.println("감자 피자의 크기 " + p2.radius);
//        System.out.println("Large : " + Large);


//  배열 혹은 객체를 넘길 수 있다.
        // not only value , can reference
        // 스태틱을 써서 공유로 만들든 객체를 생성해서 접근해서 호출하든
    }
}

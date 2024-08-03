package self.studyJava;

public class Day_0803 {
    public static class Box {
        public Object content;

    }

    public static class Box2<T> {
        public T content;
    }

    public static class Box3<T> {
        private T t;
        public T get() {
            return t;
        }
        public void set(T t) {
            this.t = t;
        }
    }

//    public static void main(String[] args) {
//        Box box = new Box();
//        box.content = "Playstation5";
//        System.out.println(box.content);
//
//        System.out.println();
//
//        Box2<String> box2 = new Box2<String>();
//        box2.content = "Playstation5";
//        String content2 = box2.content;
//        System.out.println(content2);
//
//        System.out.println();
//
//        Box2<Integer> box3 = new Box2<Integer>();
//        box3.content = 100;
//        System.out.println(box3.content);
//        int content3 = box3.content;
//        System.out.println(content3); }
    public  static <T>Box3 boxing1(T t) {
        Box3<T> box = new Box3<>();
        box.set(t);
        return box;
    }
    // 제네릭 타입을 명시한 경우
    public static <T> Box3<T> boxing(T t) {
        Box3<T> box = new Box3<>();
        box.set(t);
        return box;
    }
/*	•	제네릭 타입을 명시적으로 사용하는 것이 더 안전하며 권장됩니다. 이는 컴파일 타임에 타입 검사를 통해 오류를 방지하고, 코드의 가독성과 유지 보수성을 높이는 데 도움이 됩니다.
	•	원시 타입을 사용하는 것은 구버전의 Java와의 호환성을 위해 남아 있지만, 가능하면 피하는 것이 좋습니다.

		1.	제네릭 타입의 명시 여부:
	•	public static <T> Box3<T> boxing(T t): 이 방식은 반환 타입이 제네릭 클래스 Box3에 타입 파라미터 T를 명시적으로 지정합니다.
	즉, Box3 클래스가 전달받은 타입 T로 명시적으로 설정됩니다. 이 방식은 타입 안전성을 보장하고, 컴파일러가 타입 검사를 통해 잘못된 타입 사용을 방지할 수 있게 합니다.
	•	public static <T> Box3 boxing(T t): 이 방식은 반환 타입에서 제네릭 타입 파라미터 T를 생략하고 Box3로만 지정합니다.
	이 경우, Box3 객체는 원시 타입으로 반환되며, 제네릭의 타입 안전성을 잃게 됩니다. 따라서, 컴파일러는 타입 관련 경고를 표시할 수 있습니다.
* */
    // 원시 타입을 사용한 경우
    public static <T> Box3 boxing2(T t) {
        Box3 box = new Box3();  // 타입 파라미터를 명시하지 않음
        box.set(t);
        return box;
    }

    public static void boxing2(int a, int b){

    }

    public static void main(String[] args) {
        Box3<Integer> box1 = boxing(1000);
        int invalue = box1.get();
        System.out.println(invalue);

        Box3<String> box2 = boxing("hello");
        String invalue2 = box2.get();
        System.out.println(invalue2);

    }

}

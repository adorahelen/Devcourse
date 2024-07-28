package self.studyJava;

public class Day_0728 {

    public static class Box<T> {
        public T contentl; // 파라미터로 티를 사용
    }
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.contentl = "hello";
        String str = box1.contentl;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.contentl = 10;
        int int2 = box2.contentl;
        System.out.println(int2);
    }
}

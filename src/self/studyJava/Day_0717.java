////////package self.studyJava;
////////
////////import java.util.Scanner;
////////
////////public class Day_0717 {
////////
////////    public static void main(String[] args) {
////////
//////////        int i [];
//////////        i = new int[10];
//////////
//////////        int k [] = new int[10];
//////////        k[3] = 10;
//////////
//////////        int a[][];
//////////        a = new int[10][10];
//////////        a[0][0] = 1;
//////////
//////////        System.out.println(i[1]);
//////////        System.out.println(k[3]);
//////////        System.out.println(a[0][0]);
//////////
//////////
//////////        int intArray[] = {4,3,2,1};
//////////        System.out.println(intArray); // 이상한 값 나온다 무조건 인덱스 지정 필 수 인 듯
//////////        double doubleArray[] = {0.1, 0.2, 0.3, 0.4, 0.5};
//////////        System.out.println(doubleArray[2]);
//////////        int n = intArray[2];
//////////
//////////        int copyarray[] = new int[5];
//////////        copyarray[2] = 3;
//////////        int your[] = copyarray;
//////////        System.out.println(your[2]);
////////
////////
//////////        int intArray[] = new int[5];
//////////        int sum = 0;
//////////        Scanner scanner = new Scanner(System.in);
//////////        System.out.println(intArray.length + "  개의 정수를 입력해라");
//////////
//////////        for (int i = 0; i < intArray.length; i++)
//////////            intArray[i] = scanner.nextInt();
//////////
//////////        for (int i = 0; i < intArray.length; i++)
//////////            sum += intArray[i];
//////////
//////////        System.out.print(sum);
//////////        scanner.close();
//////////
////////
////////        // for each 문이라고 하는데, 파이썬 x in 리스트 랑 같은 문법
//////////        int [] n  = {1, 2, 3, 4, 5};
//////////        int m[] = {6,7,8,9,10};
//////////        int sum = 0;
//////////        for (int i : n) {
//////////            sum += i;
//////////        }
//////////        System.out.println(sum);
//////////
//////////        for (int i = 1; i < 11; i++) {
//////////            if (i % 2 == 0) {
//////////
//////////            }
//////////            else continue;
//////////        }
//////////        int count = 0;
//////////        char i = 65;
//////////        for (; i < 91; i++) {
//////////
//////////            if (count == 5 || count == 10 || count == 15 || count == 20) {
//////////                System.out.println();
//////////            }
//////////            count += 1;
//////////            System.out.print(i + " ");
//////////
//////////        }
////////
////////    // 초기문 + 조건식 + (아래에 있는 실행문 반복 후) 반복 후 작업
////////        // 반복할 작업문
//////////        for (int i = 0; i < 10; i++)
//////////            System.out.print(i + " ");
////////        // - 1  이 입력될 때까지 입력된 수의 평균 구하기
////////        int i = 0;
////////        int sum = 0;
////////        int count = 0;
////////        while (true) {
////////
////////            Scanner sc = new Scanner(System.in);
////////            int num = sc.nextInt();
////////            if (num == -1) {break;}
////////            count +=1;
////////            sum += num;
////////        }
////////        double average = sum/count;
////////        System.out.println(average);
////////    }
////////}
////////package self.studyJava;
////////public class Day_0717 {
////////    public static void main(String[] args) {
////////
////////        char ch = 65;
////////
////////        do {
////////            System.out.print(ch);
////////            ch++;
////////        } while (ch <= 90);
////////    }
////////}
//////
////////package self.studyJava;
////////public class Day_0717 {
////////    public static void main(String[] args) {
////////        for (int i = 1; i < 10; i++) {
////////
////////            for (int j = 1; j < 10; j++) {
////////                System.out.print(i + " * " + j + " = " + i * j + "\t") ;
////////            }
////////            System.out.println();
////////        }
////////
////////    }
//////// }
//////
//////package self.studyJava;
//////
//////import java.util.Scanner;
//////
//////public class Day_0717 {
//////    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
//////        while (true) {
//////            String text = sc.nextLine();
////////            if (text == "exit") {
////////                System.out.println("LION");
//////                // 오 진짜 안되네,,맨 끝에 널 문자 때문인가
//////            if (text.equals("end")) {
//////                break; // 오 진짜 되네 ㅋㅋㅋ
//////                }
//////            }
//////        }
//////    }
//////
//////
////
/////*
////* while 문을 만들다 보면 벗어나는 조건이 까다로운 경우도 많기 때문에
////* 조건식을 작성하느라 대부분의 학생들이 애를 먹는다.
////* */
//////  신나는 배열 가자
////
////package self.studyJava;
////
////import java.util.Scanner;
////
////public class Day_0717 {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////
////        int intArray[] = new int [5];
////        int max = 0;
////        System.out.println("양수 5개를 입력하세요.!");
////        for  (int i = 0; i < 5; i++) {
////            intArray[i] = sc.nextInt();
////            max = Math.max(max, intArray[i]);
////            // if(intAraay[i] > max) max = intArray[i];
////            // max = intArray[i] > max ? intArray[i] : max;
////        }
////        // for each == python a in list[]
////        System.out.println(max);
////    }
////}
//
//// 다차원 배열
//package self.studyJava;
//public class Day_0717 {
//    public static void main(String[] args) {
//
//        int intArray [][]; // 선언
//        intArray = new int[3][3]; // 생성자를 통한 생성
//
//        intArray[0][0] = 1;
//        intArray[0][1] = 2;
//        intArray[0][2] = 3;
//        intArray[1][0] = 4;
//        intArray[1][1] = 5;
//        intArray[1][2] = 6;
//        intArray[2][0] = 7;
//        intArray[2][1] = 8;
//        intArray[2][2] = 9;
//
//        // 메서드에서 배열 리턴
//        void makeArray() {
//            int temp[] = new int[4];
//            return temp;
//        }
//    }
//}
//
//
package self.studyJava;
public class Day_0717 {


    /*static*/ int[] makeArray(){ // 스태틱을 쓰는 이유는
        // 쓰지 않으면 클래스를 생성하고 그 다음 간접 연산자로 호출해야함
        int temp[] = new int[4];
        for (int i=0; i<temp.length; i++)
            temp[i] = i;

        return temp;
    }

    public static void main(String[] args) {
        int intArray[];
        // 스태틱을 쓰지 않아서 아래와 같이 클래스 인스턴스 생성후 호출
        Day_0717  kangmin = new Day_0717();
        intArray = kangmin.makeArray();
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");

        int [][] int2Array = /*kangmin.*/ make2DArray();
        System.out.println();
        System.out.println(int2Array[1][1]);

    }

    // 2차원 배열 생성해서 리턴하기
    static int [][] make2DArray() {
        return new int [][] {{1,2},{3,4}};
    }

}



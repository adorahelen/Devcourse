package self.studyJava;

import java.util.Scanner;

public class Day_0717 {

    public static void main(String[] args) {

//        int i [];
//        i = new int[10];
//
//        int k [] = new int[10];
//        k[3] = 10;
//
//        int a[][];
//        a = new int[10][10];
//        a[0][0] = 1;
//
//        System.out.println(i[1]);
//        System.out.println(k[3]);
//        System.out.println(a[0][0]);
//
//
//        int intArray[] = {4,3,2,1};
//        System.out.println(intArray); // 이상한 값 나온다 무조건 인덱스 지정 필 수 인 듯
//        double doubleArray[] = {0.1, 0.2, 0.3, 0.4, 0.5};
//        System.out.println(doubleArray[2]);
//        int n = intArray[2];
//
//        int copyarray[] = new int[5];
//        copyarray[2] = 3;
//        int your[] = copyarray;
//        System.out.println(your[2]);


//        int intArray[] = new int[5];
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(intArray.length + "  개의 정수를 입력해라");
//
//        for (int i = 0; i < intArray.length; i++)
//            intArray[i] = scanner.nextInt();
//
//        for (int i = 0; i < intArray.length; i++)
//            sum += intArray[i];
//
//        System.out.print(sum);
//        scanner.close();
//

        // for each 문이라고 하는데, 파이썬 x in 리스트 랑 같은 문법
        int [] n  = {1, 2, 3, 4, 5};
        int m[] = {6,7,8,9,10};
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println(sum);



    }
}

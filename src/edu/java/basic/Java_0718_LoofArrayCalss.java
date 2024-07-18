//////package edu.java.basic;
//////
//////import java.util.ArrayList;
//////import java.util.Scanner;
//////
//////public class Java_0718_LoofArrayCalss {
//////    public static void main(String[] args) {
////////        System.out.println();
////////
////////        // 향상된 스위치 문
////////        Scanner sc = new Scanner(System.in);
////////        int month = sc.nextInt();
////////        int lastday = 0;
////////        switch (month) {
////////            case 1 -> lastday = 30;
////////            case 2 , 3 ,4 , 5 -> lastday = 60;
////////            default -> System.out.println("잘못된 월입니다.");
////////        }
//////        // 동적할당 배열
//////        ArrayList<Integer> numbers = new ArrayList<>();
//////        numbers.add(10);
//////        numbers.add(20);
//////        numbers.add(30);
//////        System.out.println("ArrayList: " + numbers);
//////
//////
//////        // 1차원 배열의 선언
//////        int[] scores;
//////        char grades[];
//////
//////        // 선언된 배열의 생성 : - 크기를 지정 -  기본 값으로 자동 초기화
//////        scores = new int[3]; // 길이가 3인 정수 배열 0, 0, 0
//////        grades = new char[3]; // 길이가 3인 문자 배
//////
//////        scores[0] = 99;
//////        scores[1] = 88;
//////        scores[2] = 90;
//////
//////        System.out.println(scores.length);
//////        System.out.println(scores[0]);
//////        System.out.println(scores[1]);
//////        System.out.println(scores[2]);
//////        System.out.println(grades.length);
//////        System.out.println(grades[0]);
//////
//////
//////        boolean[] pass = new boolean[3];
//////        System.out.println(pass[0]);
//////
//////        double[] incentive = new double[] {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
//////        double[] average = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
//////        String[] Users = {"kim" , "Kang", "Min"};
//////        System.out.println(incentive.length);
//////        System.out.println(Users.length);
//////
//////        // 불가능 Users = {"hoo", "Moo", "soo"};
//////        Users = new String[]  {"GH"};
//////        System.out.println(Users.length);
//////        System.out.println(Users[0]);
//////
//////        for(int i = 0; i < Users.length; i++){
//////            System.out.println(Users[i]);
//////        }
//////
//////        for (String User : Users) {
//////            System.out.println(Users);
//////        }
//////    }
//////}
//////
////
////package edu.java.basic;
////public class Java_0718_LoofArrayCalss {
////    public static void main(String[] args) {
////        String [] name = {"kim", "Lee", "Hann", "Ann", "Ben"};
////        int [] score = {99, 88, 77, 66, 55};
////        int sum = 0;
////        for (int i = 0; i < score.length; i++) {
////
////            sum += score[i];
////        }
////        for (int i = 0; i < name.length; i++) {
////            System.out.println((i + 1)+ "\t"+ name[i] + ": " + score[i]);
////        }
////        float avg = (float)sum / score.length;
////        System.out.println(sum);
////        System.out.println(avg);
////
////
////
////    }
////}
//package edu.java.basic;
//public class Java_0718_LoofArrayCalss {
//    public static void main(String[] args) {
//        // 2차원 배열 선언
//        int [][] score;
//        char grades [][];
//
//        score = new int [2][3]; // 6개 윗층 3개 + 아래층 3개
//        grades = new char [2][];
//
//        score[0][0] = 99;
//        score[1][0] = 98;
//        score[0][1] = 99;
//        score[1][1] = 98;
//        score[0][2] = 99;
//        score[1][2] = 98;
////        grades[0] = new char [] {'A','B','C','D','E','F', '9'};
////        grades[1] = new char [] {'A','B','C','D','E','F'};
//
//
//        grades[0] = new char[2];
//        grades[1] = new char[4];
//
//        grades[0][0] = 'H';
//        grades[0][1] = 'i';
//
//        grades[1][0] = 'J';
//        grades[1][1] = 'A';
//        grades[0][0] = 'V';
//        grades[0][1] = 'A';
//
//        boolean [][] pass = new boolean[3][2];
//        double [][] incentive
//                = new double [][] {{ 0.1, 0.2, 0.3},
//                                    { 0.4, 0.5, 0.6},};
//
//        String [][] users = {{"d", "d", "dddd", "ddd"},{"d"}};
////
////        ldevers = new String [][] { {"a"}, {"s"} };
//
//        String levels[][] = new String [][] {{},{}};
//        System.out.println("user   -foreach");
//
//
//        for (int i = 0; i < users.length; i++) {
//            for(int j = 0; j < users[i].length; j++) {
//                System.out.println(users[i][j]);
//            }
//
//        }
//
//        System.out.println();
//
//
//        for (String[] user : users) {
//            for (String u : user) {
//                System.out.println(u);
//            }
//
//        }
//    }
//}

package edu.java.basic;
public class Java_0718_LoofArrayCalss {
    public static void main(String[] args) {


        int score[][] = new int [3][5];
        score[0][0] = 100;
        score[0][1] = 95;
        score[0][2] = 98;
        score[1][0] = 27;
        score[1][1] = 48;
        score[1][2] = 22;
        score[2][0] = 69;
        score[2][1] = 77;
        score[2][2] = 80;
        int koreasum = 0;
        int english = 0;
        int math = 0;
        int all1 = 0;
        int all2 = 0;
        int all3 = 0;

        for(int i = 0; i < score.length; i++) {
            koreasum += score[i][0];
            english += score[i][1];
            math += score[i][2];

            all1 = score[0][0] + score[0][1] + score[0][2];
            all2 = score[1][0] + score[1][1] + score[1][2];
            all3 = score[2][0] + score[2][1] + score[2][2];

            score[0][3] = all1;
            score[1][3] = all2;
            score[2][3] = all3;

            // 4행에 나누기 해서 넣으면 끝
            score[0][4] = all1 /3;
            score[1][4] = all2 /3;
            score[2][4] = all3 /3;


            System.out.println(score[i][0] + " " + score[i][1] + " " + score[i][2] + " " + score[i][3] + " " + score[i][4]);

        }
        System.out.println(koreasum+ " " + english+  " " + math );
        float koreasum2 = (float) koreasum / 3;
        float english2 = (float) english / 3;
        float math2 = (float) math / 3;
        System.out.println(koreasum2 + " " + english2 + " " + math2);
    }
}


//int i = 5;
//int [] ii = { 1, 2};
//int [][] scores = {{100, 95, 98}, {27,48,22}, {69, 77, 80}};
//String [] subject = {"번호", "국어", "영어", "수학", "총점", "평균"};
//
//// 출력 레이블 표시
//for ( String l : subject) {
//    System.out.println( l + "\t");
//}
//
//sout.println();
//sout.println("----------------------");
//for (int i = 0; i < scores.length; i ++) {
//    sout print ( i + 1) +  "번\t" );
//
//    for (int j = 0; j < scores [i]. length; j ++ )
//        sout (sc)
//
//    sout.println();
//        }

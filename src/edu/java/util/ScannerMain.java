package edu.java.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ScannerMain {
//    private static Scanner scanner;

    public static void main(String[] args) throws IOException {
//        String str = "1 and 2 and bee and ant and fly";

//        Scanner scanner = new Scanner(str);
//        scanner.useDelimiter("\\s*and\\s*");
//
//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.next());
//        scanner.close();
        
        
        // 2.File 읽어오기
//        scanner = new Scanner(new File("src/user.txt"));
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();

//        System.out.println();
//        System.out.println("3.");
//        scanner = new Scanner(System.in);
//        System.out.println("문자열 입력 : ");
//        String input = scanner.nextLine();
//        System.out.println(input);

        
//        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.nextLine());
//        System.out.println();

        System.out.println("웹페이지 크롤링");
        String url = "https://www.cu.ac.kr/index.php";
        URLConnection connection = new URL(url).openConnection();

        // URL로 입력스트림 받아오기
        Scanner sc = new Scanner(connection.getInputStream());
        sc.useDelimiter("\\Z");

        String html = sc.next();

        System.out.println(html);

        System.out.println("사용된 것들 ");
        System.out.println(html.length());
        sc.close();

        System.exit(0);

    }
}

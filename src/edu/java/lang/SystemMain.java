package edu.java.lang;
import java.util.Date;
import java.util.Properties;

public class SystemMain{
    public static void main(String[] args) throws Exception{
        long nowMillis = System.currentTimeMillis();
//        System.out.println(nowMillis);
//        System.out.println(new Date(nowMillis));
//
//        System.out.println("system property");
//        System.out.println("OS Name: " + System.getProperty("os.name"));
//        System.out.println("OS Version: " + System.getProperty("os.version"));
//        System.out.println("OS Architecture: " + System.getProperty("os.arch"));
//        System.out.println("Java version: " + System.getProperty("java.version"));
//        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
//        System.out.println("Java vendor version: " + System.getProperty("java.vendor.version"));
//        System.out.println("Java vendor machine: " + System.getProperty("java.vendor.machine"));
//
//        System.out.println();
//        System.out.println("File system property" + System.getProperty("file.separator"));
//        System.out.println("Path: " + System.getProperty("path.separator"));


//        System.out.println("===신기방기===");
//        Properties prove = System.getProperties();
//        prove.list(System.out);
//
//        System.exit(0);
//        System.out.println("시스템을 종료합니다.");

//        System.out.println();
//       int input = System.in.read(); // 1바이트 읽을 수 있음 ㅋㅋ
//        System.out.println(input);
//        System.out.println((char)input);

        // 단어 입력을 받아보자
        System.out.println(" in put the word");
        byte[] inputBytes = new byte[10];
        int inputs = System.in.read(inputBytes);
        System.out.println("input bytes: " + inputs);
        for (byte b : inputBytes) {
            System.out.print( b + " ");
        }
        System.out.println(
        );
        System.in.close();
    }
}

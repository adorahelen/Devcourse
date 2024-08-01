package edu.java.jdbc.controller;


import edu.java.jdbc.util.DBCon;

import java.sql.*;
import java.util.Scanner;

public class MemberMain {
    public static Scanner scan;

        public void menu() {
            System.out.println("----------------------------------------");
            System.out.println(" ㅁ MEMBER only SYSTEM ㅁㅁㅁㅁㅁ MAIN MENU");
            System.out.println("----------------------------------------");
            System.out.println("1. 가입       2. 시스템 종료");
            System.out.println("선택 : ");

            switch ( scan.nextLine()) {
                case "1" : join(); break;
                case "2" : System.out.println("시스템을 종료합니다.");
                    DBCon.close();
                    System.exit(0);
                default:
                    System.out.println("> 1 ~ 2 를 선택해 주세요. ");
            }


        }



    public void join() {
            // 사용자의 데이터를 입력받아 MemberVO 객체에 저장한 후
        System.out.println("----------------------------------------");
        System.out.println(" ㅁ MEMBER only SYSTEM ㅁㅁㅁㅁㅁ MAIN JOIN");
        System.out.println("----------------------------------------");
        System.out.println("ID : ");

    }
    public void modify(){

    }
    public void remove(){

    }
    public void view(){}
    public void list(){

    }


    public static void main(String[] args) {
        scan  = new Scanner(System.in);
        new MemberMain().menu();


    }




}

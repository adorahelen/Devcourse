package edu.java.jdbc.controller;


import edu.java.jdbc.dao.MemberDAO;
import edu.java.jdbc.util.DBCon;
import edu.java.jdbc.vo.MemberVO;

import java.sql.*;
import java.util.Scanner;

public class MemberMain {
    public static Scanner scan;
    private static MemberDAO mdao;

        public void menu() {
            while (true) {
                System.out.println("\n----------------------------------------");
                System.out.println(" ㅁ MEMBER only SYSTEM ㅁㅁㅁㅁㅁ MAIN MENU");
                System.out.println("----------------------------------------");
                System.out.println("1. 가입    2. 회원정보수정    3. 시스템 종료");
                System.out.println("> 선택 : ");

                switch (scan.nextLine()) {
                    case "1":
                        join();
                        break;

                   case "2":
                            modify();
                            break;

                    case "3":
                        System.out.println("> 시스템을 종료합니다.");
                        DBCon.close();
                        System.exit(0);
                    default:
                        System.out.println("> 1 ~ 2 를 선택해 주세요. ");
                }

            }
        }



    public void join() {
        MemberVO mvo = new MemberVO();
            // 사용자의 데이터를 입력받아 MemberVO 객체에 저장한 후
        System.out.println("----------------------------------------");
        System.out.println(" ㅁ MEMBER only SYSTEM ㅁㅁㅁㅁㅁ JOIN");
        System.out.println("----------------------------------------");
        System.out.println("ID : ");                mvo.setMid(scan.nextLine());
        System.out.println("Your name : ");         mvo.setMname(scan.nextLine());
        System.out.println("Your password : ");     mvo.setMpw(scan.nextLine());
        System.out.println("Your email : ");        mvo.setEmail(scan.nextLine());
        System.out.println("Your gender : ");       mvo.setGender(scan.nextLine());
        System.out.println("Your photo : ");        mvo.setPhoto(scan.nextLine());
        System.out.println("Your birthday : ");     mvo.setBirthDate(scan.nextLine());

      if(  mdao.insert(mvo) ) {
          System.out.println(" Join is ok");
          System.out.println(" Do login and USE");
      } else {
          System.out.println(" Do login and USE FAIL");
          System.out.println(" Retry ...");
      }

    }


    public void modify(){
        System.out.println("----------------------------------------");
        System.out.println(" ㅁ MEMBER only SYSTEM ㅁㅁㅁㅁㅁ MODIFY");
        System.out.println("----------------------------------------");

        String mid = scan.nextLine();

        MemberVO mvo = mdao.select(mid);

        System.out.println("Your password : ");
        String input = scan.nextLine();
        if (!input.isEmpty())
            mvo.setMpw(input);


        System.out.println("Your email : ");
        input = scan.nextLine();
        if (!input.isEmpty())
            mvo.setEmail(input);

        System.out.println("Your photo : ");
        input = scan.nextLine();
        if (!input.isEmpty())
            mvo.setPhoto(input);

        if (mdao.update(mvo)) {
            System.out.println(" Modify is ok");
        } else {
            System.out.println(" Modify FAIL");
            System.out.println(" Retry ...");
        }
    }



    public void remove(){

    }
    public void view(){}
    public void list(){

    }


    public static void main(String[] args) {
        scan  = new Scanner(System.in);
        mdao = new MemberDAO();
        new MemberMain().menu();


    }




}

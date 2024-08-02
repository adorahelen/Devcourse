package edu.java.jdbc.controller;

import edu.java.jdbc.dao.BordDAO;
import edu.java.jdbc.vo.BordVO;

import java.util.Scanner;

public class BordMain {

    public static Scanner scan;
    private static BordDAO voda;

    public void menu() {
        while (true) {
            System.out.println("\n----------------------------------------");
            System.out.println(" ㅁ MEMBER only SYSTEM ㅁㅁㅁㅁㅁ BORD MENU");
            System.out.println("----------------------------------------");

            System.out.println(" 1. 게시물 작성 ");
            System.out.println(" 2. 게시물 수정 ");
            System.out.println(" 3. 게시물 삭제 ");
            System.out.println(" 4. 게시물 조회 ");
            System.out.println(" 5. 게시물 목록 ");
            System.out.println(" 6. 시스템 종료 ");
            System.out.println("> 선택 : ");

            switch (scan.nextLine() ) {
                case "1":


            }
        }
    }


    public void Create() {
        BordVO vo = new BordVO();
        System.out.println("게시물을 생성합니다.");
        System.out.println("타이틀을 입력해라 : ");  vo.setTitle(scan.nextLine());
        System.out.println("컨텐츠를 입력해라 : ");  vo.setContent(scan.nextLine());
        System.out.println("작성자를 입략해라 : ");  vo.setWriter(scan.nextLine());

        if(  voda.insert(vo) ) {
            System.out.println(" Create ok");
            System.out.println(" Do and USE");
        } else {
            System.out.println(" Create FAIL");
            System.out.println(" Retry ...");
        }

    }


    public void Update() {

    }
    public void Delete() {}
    public void Search() {}
    public void SearchAll() {}
    public void Kill() {}
}

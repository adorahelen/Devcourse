package edu.java.jdbc.controller;

import edu.java.jdbc.dao.BordDAO;
import edu.java.jdbc.util.DBCon;
import edu.java.jdbc.vo.BordVO;
import edu.java.jdbc.vo.MemberVO;

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

            switch (scan.nextLine()) {
                    case "1":
                    Create();
                    break;

                    case "2":
                        Update();
                        break;

                        case "3":
                            Delete();
                            break;

                            case "4":
                                Search();
                                break;

                                case "5":
                                    SearchAll();
                                    break;

                                    case "6":
                                        System.out.println("end");
                                        scan.close();
                                        DBCon.close();
                                        System.exit(0);


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

       // INSERT 쿼리 실행 실패
       // 23000 | 1452 | Cannot add or update a child row: a foreign key constraint fails (`modeldb`.`t_board`, CONSTRAINT `fk_board_writer` FOREIGN KEY (`writer`) REFERENCES `t_member` (`mid`))
       // Create FAIL
       // Retry ...
        // => t_member 테이블에 있는 맴버가 아니면 작성이 안된다
    }


    public void Update() {
        System.out.println("게시물을 수정합니다. ");

        BordVO vo = new BordVO();

        voda.update(vo);

        System.out.println("New Title : ");
        String input = scan.nextLine();
        if (!input.isEmpty())
            vo.setTitle(input);


        System.out.println("New Content : ");
        input = scan.nextLine();
        if (!input.isEmpty())
            vo.setContent(input);

        System.out.println("New Bno : ");
        int newBNO;
        newBNO = scan.nextInt();
        if (newBNO != 0) { //이부분 걱정
            vo.setBno(newBNO);
        }

        if (voda.update(vo)) {
            System.out.println(" Modify is ok");
        } else {
            System.out.println(" Modify FAIL");
            System.out.println(" Retry ...");
        }
    }
    public void Delete() {
        System.out.println("게시물을 삭제합니다. ");
        System.out.println("게시물 번호를 입력하세여 : ");
        int bno = scan.nextInt();

        if(voda.delete(bno)) {
            System.out.println(" Delete ok");
        } else {
            System.out.println(" Delete FAIL");
            System.out.println(" Retry ...");
        }
    }
    public void Search() {
        System.out.println("view one Select : RESARCH");
        int bno = scan.nextInt();
        BordVO vo = voda.select(bno);
        if (bno != 0) {
            System.out.println("Search ok");
            System.out.println(vo.getBno());
            System.out.println(vo.getTitle());
            System.out.println(vo.getContent());
            System.out.println(vo.getWriter());
            System.out.println(vo.getWriteDate());
            System.out.println(vo.getHit());
            voda.updateHit(bno);
        }
    }
    public void SearchAll() {}


    public static void main(String[] args) {
        scan  = new Scanner(System.in);
        voda = new BordDAO();
        new BordMain().menu();
    }
}

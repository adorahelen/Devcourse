package edu.java.jdbc.controller;

import edu.java.jdbc.dao.BordDAO;
import edu.java.jdbc.dao.ReplyDAO;
import edu.java.jdbc.util.DBCon;
import edu.java.jdbc.vo.BordVO;
import edu.java.jdbc.vo.ReplyVO;


import java.util.List;
import java.util.Scanner;

public class BordMain {

    public static Scanner scan;
    private static BordDAO voda;
    private static ReplyDAO reply;

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
            SearchAll(); // 게시물 목록 화면으로 이동
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
        System.out.println("수정할 게시물 번호를 입력하시오 : ");
        String bno = scan.nextLine(); // 수정하려는 레코드의 번호를 입력받습니다
        BordVO vo = voda.select( Integer.parseInt(bno) ); // 문자열 bno를 정수로 파싱

        // BordVO vo = new BordVO(); 이거 하나만 해도 돌아기는 허던데



        System.out.println("New Title : ");
        String input = scan.nextLine();
        if (!input.isEmpty())
            vo.setTitle(input);

        System.out.println("New Content : ");
        input = scan.nextLine();
        if (!input.isEmpty())
            vo.setContent(input);

//        System.out.println("New Bno : ");
//        int newBNO;
//        newBNO = scan.nextInt();
//        if (newBNO != 0) { //이부분 걱정
//            vo.setBno(newBNO);
//        }

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
        // String bno = scan.nextLine();

        // if (voda.delete ( Integer.parseInt ( bno ) ) )
        if(voda.delete(bno)) {
            System.out.println(" Delete ok");
        } else {
            System.out.println(" Delete FAIL");
            System.out.println(" Retry ...");
        }
    }
    public void Search() {
        System.out.println("view one Select : RESARCH");
        System.out.println("Member only === BOARD VIEW ");
        System.out.println("조회할 번호 입력 ");
        int bno = scan.nextInt();
        BordVO vo = voda.select(bno);
        ReplyVO ro = new ReplyVO();


        // String bno = scan.nextLine();
        // BoardVO vo = boda.select(Integer.paresInt(bno));

        // if ( vo != null ) 
        if (bno != 0) {
            System.out.println("Search ok");
            System.out.println(vo.getBno());
            System.out.println(vo.getTitle());
            System.out.println(vo.getContent());
            System.out.println(vo.getWriter());
            System.out.println(vo.getWriteDate());
            System.out.println(vo.getHit());
            voda.updateHit(bno);


//            while (true) {
//                System.out.println(" 1. 댓글 달기 2. 메뉴보기");
//
//                switch (scan.nextLine()) {
//                    case "1":
//                        System.out.println("댓글 작성할 게시물 번호 "); ro.setBno(scan.nextInt());
//                        System.out.println("작성자를 입략해라 : ");  ro.setReplier(scan.nextLine());
//                        System.out.println("댓글내용을 입력해라 : ");  ro.setReply(scan.nextLine());
//
//                        if(reply.insert(ro) ) {
//                            System.out.println(" Reply Create ok");
//                            SearchAll(); // 게시물 목록 화면으로 이동
//                            System.out.println(" Do and USE");
//                            break;
//
//                        } else {
//                            System.out.println(" Reply Create FAIL");
//                            break;
//                        }
//                    case "2": break;
//
//                    default:break;
//                }
//            }
        } else {
            System.out.println("Search FAIL : 게시물 없음 ");
        }
    }
    public void SearchAll() {

        System.out.println("----------------------------------------");
        System.out.println(" ㅁ BORAD SYSTEM ㅁㅁㅁㅁㅁ SEARCH ALL ");
        System.out.println("----------------------------------------");
        List<BordVO> listlist = voda.selectAll();

        //use for each :
        for (BordVO vo : listlist) {
            System.out.println(vo.getTitle() + "\t" + vo.getContent() + "\t" + vo.getWriter() + "\t" + vo.getWriteDate() + "\t" + vo.getHit() + "\t" + vo.getBno());
        }


      //  System.out.println();
        // listlist.forEach(mvo -> System.out.println(mvo.getMid() + "|" + mvo.getMname() + "|" + mvo.getEmail() + "|" + mvo.getJoin_date()));

    }


    public static void main(String[] args) {
        scan  = new Scanner(System.in);
        voda = new BordDAO();
        reply = new ReplyDAO(); // 뉴를 안해서 그렇다가 여기 구나
        new BordMain().menu();
    }
}

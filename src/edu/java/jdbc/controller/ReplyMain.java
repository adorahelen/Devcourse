package edu.java.jdbc.controller;

import edu.java.jdbc.dao.BordDAO;
import edu.java.jdbc.dao.ReplyDAO;
import edu.java.jdbc.util.DBCon;
import edu.java.jdbc.vo.BordVO;
import edu.java.jdbc.vo.ReplyVO;

import java.util.List;
import java.util.Scanner;

public class ReplyMain {


    public static Scanner scan;

    private static ReplyDAO reply;

    public void menu() {
        while (true) {
            System.out.println("\n----------------------------------------");
            System.out.println(" ㅁ MEMBER only SYSTEM ㅁㅁㅁㅁㅁ Reply MENU");
            System.out.println("----------------------------------------");

            System.out.println(" 1. 댓글 작성 ");
            System.out.println(" 2. 댓글 수정 ");
            System.out.println(" 3. 댓글 삭제 ");
            System.out.println(" 4. 댓글 조회 ");
            System.out.println(" 5. 댓글 목록 ");
            System.out.println(" 6. 시스템 종료 ");
            System.out.println("> 선택 : ");

            switch (scan.nextLine()) {
                case "1":
                    //CommentCreate();
                    break;

                case "2":
                    CommentUpdate();
                    break;

                case "3":
                    CommentDelete();
                    break;

                case "4":
                   // Search();
                    break;

                case "5":
                   // SearchAll();
                    break;

                case "6":
                    System.out.println("end");
                    scan.close();
                    DBCon.close();
                    System.exit(0);


            }
        }
    }

// 매개 변수가 필요함
    public void CommentCreate(int bno) {
        ReplyVO rvo = new ReplyVO();
        rvo.setBno(bno);
        System.out.println("게시물 번호는 : " + bno);
        System.out.println("댓글 작성자 : ");  rvo.setReplier(scan.nextLine());
        System.out.println("댓글 내용 : "); rvo.setReply(scan.nextLine());


        if( reply.insert(rvo) ) { // 여기
            System.out.println(" Create ok");
          //  SearchAll(); // 게시물 목록 화면으로 이동
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


    public void CommentUpdate() {
        System.out.println("댓글을 수정합니다. ");
        System.out.println("댓글 번호를 입력하시오 : ");
        String rno = scan.nextLine(); // 수정하려는 레코드의 번호를 입력받습니다

        if (rno.isEmpty()) {
            System.out.println("cancled ");
        } else {

            ReplyVO rvo = reply.select(Integer.parseInt(rno)); // 문자열 bno를 정수로 파싱

            System.out.println("New Comment : ");
            String input = scan.nextLine();
            if (!input.isEmpty()) rvo.setReply(input);

            if (reply.update(rvo)) {
                System.out.println(" 댓글 수정이 성공 ");
            } else {
                System.out.println(" 댓글 수정 실패 ");
                System.out.println(" Retry ...");
            }
         }
    }


    public void CommentDelete() {

        System.out.println("댓글을 삭제합니다. ");
        System.out.println("댓글 번호를 입력하세여 : ");
       // int bno = scan.nextInt();
         String bno = scan.nextLine();

        if (reply.delete ( Integer.parseInt ( bno ) ) ) {
        // if(voda.delete(bno)) {
            System.out.println(" 댓글이 삭제됬습니다 ");
        } else {
            System.out.println(" Delete FAIL");
            System.out.println(" Retry ...");
        }
    }

    public void replyMenu(int bno) {
        System.out.println("----------------------------");
        System.out.println("1. 댓글 등록  2. 댓글 목록   3. 이전 메뉴 ");
        System.out.println(" >>>> 선택 : ");
    }


    public void SearchAll(int bno) {

        String query = "SELECT * FROM t_reply WHERE bno = " + bno;

        System.out.println("----------------------------------------");
        System.out.println(" ㅁ BORAD SYSTEM ㅁㅁㅁㅁㅁ SEARCH ALL ");
        System.out.println("게시물 번호 : " + bno);
        System.out.println("----------------------------------------");
        List<ReplyVO> listlist = reply.selectAll();

        //use for each :
      //  for ( vo : listlist) {
        //    System.out.println(vo.getTitle() + "\t" + vo.getContent() + "\t" + vo.getWriter() + "\t" + vo.getWriteDate() + "\t" + vo.getHit() + "\t" + vo.getBno());
        //}


         System.out.println();
        for (ReplyVO rvo : listlist) {
            System.out.println(rvo.getReply() + "|" + rvo.getReplier());
        }

    }
}
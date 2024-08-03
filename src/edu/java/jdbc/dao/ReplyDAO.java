package edu.java.jdbc.dao;

import edu.java.jdbc.util.DBCon;
import edu.java.jdbc.vo.ReplyVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReplyDAO {

    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;



    public ReplyDAO() {
        this.con = DBCon.getConnection();
    } // connect

    public boolean insert(ReplyVO rvo) {

        String query = " INSERT INTO t_reply(bno, reply, replier) VALUES(?, ?, ?) ";
// 쿼리문 입력 방식에 따른 에러 발생 가능성 있음
        // 댓글내용 - 댓글 작성자
        try {
            pstmt = con.prepareStatement(query); //쿼리문을 미리 준비
            pstmt.setInt(1, rvo.getBno());
            pstmt.setString(2, rvo.getReply());         //쿼리의 물음표에 해당하는 값 바인딩
            pstmt.setString(3, rvo.getReplier());
// 바뀌는 건 여기까지 밑에는 계속 동일하다 ㅏ

            int result = pstmt.executeUpdate(); // DML 쿼리 실행 결과 행 수 저장
            if (result == 1) { //추가 성공인 경우
                DBCon.close(pstmt);
                return true;

            }
        } catch (SQLException e) {
//          throw new RuntimeException(e);
            System.err.println("INSERT 댓글 쿼리 실행 실패");
            System.out.println(e.getSQLState() + " | " +
                    e.getErrorCode() + " | " + e.getMessage());
        } finally {     //예외 발생 여부 관계없이 항상 실행
            DBCon.close(pstmt);
        }
        return false;
    }

    public boolean update(ReplyVO rvo) {
        String query = " UPDATE t_reply SET reply = ? WHERE rno = ? ";
// mid 대신에 bno로 잡았는데, 문제의 원인이 될 수도?

        try {
            pstmt = con.prepareStatement(query); //쿼리문을 미리 준비
            pstmt.setString(1, rvo.getReply());        //쿼리의 물음표에 해당하는 값 바인딩
            pstmt.setInt(2, rvo.getBno());
          // 근데 이건 자동 생성인데, 수정할 필요가 있나? 지정해서 수정하나?


            int result = pstmt.executeUpdate(); // DML 쿼리 실행 결과 행 수 저장
            if (result == 1) { //추가 성공인 경우
                DBCon.close(pstmt);
                return true;
            }
        } catch (SQLException e) {
            //           throw new RuntimeException(e);
            System.err.println("UPDATE 쿼리 실행 실패");
            System.out.println(e.getSQLState() + " | " +
                    e.getErrorCode() + " | " + e.getMessage());
        } finally {     //예외 발생 여부 관계없이 항상 실행
            DBCon.close(pstmt);
        }
        return false;
    }

    public boolean delete(int rno) {
        String query = " DELETE FROM t_reply WHERE rno = ? ";

        try {
            pstmt = con.prepareStatement(query); //쿼리문을 미리 준비
            pstmt.setInt(1, rno);         //쿼리의 물음표에 해당하는 값 바인딩



            int result = pstmt.executeUpdate(); // DML 쿼리 실행 결과 행 수 저장
            if (result == 1) { //추가 성공인 경우
                DBCon.close(pstmt);
                return true;
            }
        } catch (SQLException e) {
            //           throw new RuntimeException(e);
            System.err.println("Delete 쿼리 실행 실패");
            System.out.println(e.getSQLState() + " | " +
                    e.getErrorCode() + " | " + e.getMessage());
        } finally {     //예외 발생 여부 관계없이 항상 실행
            DBCon.close(pstmt);
        }
        return false;


    }
    public ReplyVO select(int rno) {   //매개변수로 넘겨받은 회원아이디의 레코드 조회 ----
        String query = " SELECT * FROM t_reply WHERE rno = ? ";
        ReplyVO rvo = null;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, rno);         //쿼리의 물음표에 해당하는 값 바인딩
            rs = pstmt.executeQuery();    //쿼리 실행하고 결과 레코드 받기

            if (rs.next()) { //읽어올 값이 있는지 확인
                rvo = new ReplyVO(); // 객체를 생성하여 읽어온 값들을 각 필드에 저장 시킨다.
                rvo.setBno(rs.getInt("bno"));
                rvo.setRno(rs.getInt("rno"));
                rvo.setReply(rs.getString("reply"));
                rvo.setReplier(rs.getString("replier"));
                rvo.setReplyDate(rs.getDate("replyDate"));
            }
        } catch (SQLException e) {
            //           throw new RuntimeException(e);
            System.err.println("Select 쿼리 실행 실패");
            System.out.println(e.getSQLState() + " | " +
                    e.getErrorCode() + " | " + e.getMessage());
        } finally { // 예외 다시
            DBCon.close(rs, pstmt);

            return rvo;
        }

    }
    // 아래는 아직 안바꿈
    public List<ReplyVO> selectAll() { //t_member 테이블의 모든 레코드 조회 ----------------
        String query = " SELECT * FROM t_board ";
        List<ReplyVO> list = new ArrayList<>();

        try {
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();    //쿼리 실행하고 결과 레코드 받기

            while (rs.next()) {        //더이상 읽을 값이 없을 때까지 반복
                ReplyVO rvo = new ReplyVO(); // 객체를 생성하여 읽어온 값들을 각 필드에 저장 시킨다.
                rvo.setBno(rs.getInt("bno"));
                rvo.setRno(rs.getInt("rno"));
                rvo.setReply(rs.getString("reply"));
                rvo.setReplier(rs.getString("replier"));
                rvo.setReplyDate(rs.getDate("replyDate"));

                list.add(rvo); // 생성된 mvo 객체를 list 에 저장
            }


        } catch (SQLException e) {
            //           throw new RuntimeException(e);
            System.err.println("All Select 쿼리 실행 실패");
            System.out.println(e.getSQLState() + " | " +
                    e.getErrorCode() + " | " + e.getMessage());
        } finally {
            DBCon.close(rs, pstmt);
        }
        return list;
    }


//    // 게시물 조회수 증가시키기?
//    public boolean updateHit(int bno) { // 조회 수를 장가시킬 게시물 번호 받기
//        String query = " UPDATE t_board SET hit = +1  WHERE bno = ? ";
//        try {
//            pstmt = con.prepareStatement(query); //쿼리문을 미리 준비
//            pstmt.setInt(1, bno);         //쿼리의 물음표에 해당하는 값 바인딩
//
//            int result = pstmt.executeUpdate(); // DML 쿼리 실행 결과 행 수 저장
//            if (result == 1) { //추가 성공인 경우
//                DBCon.close(pstmt);
//                return true;
//            }
//        } catch (SQLException e) {
//            //           throw new RuntimeException(e);
//            System.err.println("UPDATE 조회수 쿼리 실행 실패");
//            System.out.println(e.getSQLState() + " | " +
//                    e.getErrorCode() + " | " + e.getMessage());
//        } finally {     //예외 발생 여부 관계없이 항상 실행
//            DBCon.close(pstmt);
//        }
//        return false;
//    }
}

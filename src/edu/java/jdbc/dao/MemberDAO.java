package edu.java.jdbc.dao;

import edu.java.jdbc.util.DBCon;
import edu.java.jdbc.vo.MemberVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class MemberDAO {
    private Connection con; // DB 연결 객체
    private Statement stmt; // 쿼리(매개변수 없는, 변수 포함 아닌) 실행할 객체
    private PreparedStatement pstmt; // 쿼리(매개 변수 있는, 변수 포함, 만능, 즉 변수를 ?로 바인딩하는 경우)  실행 객체
    private ResultSet rs; // 쿼리 실행 결과 저장

    // 기본생성자에서
    // DBcon 의 Connection 객체를 반환하는 메서드를 이용하여 con 객체 받아오기
    // 객체를 반환하는 메서드를 이용해서 객체 초기화
    public MemberDAO(Connection con) {
        this.con = DBCon.getConnection();
    }

// #################################################################################


    public boolean insert(MemberVO mvo) {   //t_member 테이블에 레코드 추가 ---------------------
        //회원아이디, 회원이름, 비밀번호, 이메일,   성별, 사진,  생년월일
        // 매개변수로 넘겨받은 mvo에서 꺼내서 쿼리문 작성

        String query = " INSERT INTO t_member VALUES(?, ?, ?, ?, ?, ?, ?, NOW()) ";

        try {
            pstmt = con.prepareStatement(query); //쿼리문을 미리 준비
            pstmt.setString(1, mvo.getMid());         //쿼리의 물음표에 해당하는 값 바인딩
            pstmt.setString(2, mvo.getMname());
            pstmt.setString(3, mvo.getMpw());
            pstmt.setString(4, mvo.getEmail());
            pstmt.setString(5, mvo.getGender());
            pstmt.setString(6, mvo.getPhoto());
            pstmt.setString(7, mvo.getBirthDate());

            int result = pstmt.executeUpdate(); // DML 쿼리 실행 결과 행 수 저장
            if (result == 1) { //추가 성공인 경우
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
//            System.err.println("INSERT 쿼리 실행 실패");
//            System.out.println(e.getSQLState() + " | " +
            //                   e.getErrorCode() + " | " + e.getMessage());
        } finally {     //예외 발생 여부 관계없이 항상 실행
            DBCon.close(pstmt);
        }
        return false;
    }

    public boolean update(MemberVO mvo) {    //t_member 테이블의 회원아이디가 bbb인 레코드 변경 ----
        //이메일 : bbb@bbb.com, 사진 : b.pn
        String query = " UPDATE t_member SET email = '?', photo = '?', WHERE mid = '?' ";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, mvo.getEmail());
            pstmt.setString(2, mvo.getPhoto());
            pstmt.setString(3, mvo.getMid());


            int result = pstmt.executeUpdate(); // DML 쿼리 실행 결과 행 수 저장
            if (result == 1) { //추가 성공인 경우
                DBCon.close(pstmt);
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
//            System.err.println("INSERT 쿼리 실행 실패");
//            System.out.println(e.getSQLState() + " | " +
            //                   e.getErrorCode() + " | " + e.getMessage());
        } finally {     //예외 발생 여부 관계없이 항상 실행
            DBCon.close(pstmt);
        }
        return false;
    }

    public boolean delete(String id) {   //회원아이디를 매개변수로 받아 레코드 삭제 ----
        String query = " DELETE FROM t_member WHERE mid = ? ";


        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, id);

            //쿼리 실행 객체 생성- try with resources이용 - 별도의 닫기 처리 불필요
            int result = pstmt.executeUpdate(); // DML - delete 쿼리 실행
            if (result == 1) {
                DBCon.close(pstmt);
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBCon.close(pstmt);

        }
        return false;
    }

    public MemberVO select(String id) {   //매개변수로 넘겨받은 회원아이디의 레코드 조회 ----
        String query = " SELECT * FROM t_member WHERE mid = ? ";
        MemberVO mvo = null;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, id);         //쿼리의 물음표에 해당하는 값 바인딩
            rs = pstmt.executeQuery();    //쿼리 실행하고 결과 레코드 받기

            if (rs.next()) { //읽어올 값이 있는지 확인
                mvo = new MemberVO(); // 객체를 생성하여 읽어온 값들을 각 필드에 저장 시킨다.
                mvo.setMid(rs.getString("mid"));
                mvo.setMname(rs.getString("mname"));
                mvo.setEmail(rs.getString("email"));
                mvo.setGender(rs.getString("gender"));
                mvo.setPhoto(rs.getString("photo"));
                mvo.setBirthDate(rs.getString("birthDate"));
                mvo.setGender(rs.getString("Join_data"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBCon.close(rs, pstmt);

            return mvo;
        }

    }

    public List<MemberVO> selectAll() { //t_member 테이블의 모든 레코드 조회 ----------------
        String query = " SELECT * FROM t_member ";
        List<MemberVO> list = new ArrayList<>();

        try {
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();    //쿼리 실행하고 결과 레코드 받기

            while (rs.next()) {        //더이상 읽을 값이 없을 때까지 반복
                MemberVO mvo = new MemberVO(); // 객체를 생성하여 읽어온 값들을 각 필드에 저장 시킨다.
                mvo.setMid(rs.getString("mid"));
                mvo.setMname(rs.getString("mname"));
                mvo.setEmail(rs.getString("email"));
                mvo.setGender(rs.getString("Join_data"));
                list.add(mvo); // 생성된 mvo 객체를 list 에 저장
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBCon.close(rs, pstmt);
        }
        return list;
    }
}

//모델로 맴버 브이오를 만들어 쓰고 있다
//        컨트롤로가 맴버 다오
// 뷰 : 콘솔, 프론트
//
//데이터를 가지는 애를 모델 (맴버점브이오), 데이터베이스 연결하고 돌리는건 컨트롤러 (맴버점다오) == 레피지토리
//
//디자인 패턴 중 하나 엠브이씨,(스프링사용중인)
//데이터는 모델, 보이는 건 뷰, 그 사이가 컨트롤러 그리고 컨트롤러랑 디비 사이에 서비스라는 파트 추가히기도


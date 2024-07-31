package edu.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    private Connection con; // DB 연결 객체
    private Statement stmt; // 쿼리를 실행할 객체

    public JDBCTest() {
        String url = "jdbc:mysql://localhost:3306/modeldb";
        // MySQl 접속 정보 및 스키마(디비) 선택

        String username = "root"; // 접속 계정
        String password = "12345678";// 비밀번호

        // MySQl DB 접속 - Connection 객체 생성, 인터페이스라서 뉴 못함
       // Connection con = null;
        try {      // 그래서 드라이버 매니저를 이용
            con = DriverManager.
                    getConnection(url, username, password);
            System.out.println("connection OK!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void insert(){ // t_member 테이블에 데이터 추가
        // 회원아이디, 회원이름, 비밀번호, 이메일, 성별, 사진, 생년월일, 가입일자
        // aaa 김이박 1111 a@a.com F a.png 1999-09-09 지금
        // bbb 김비비 1111 b@b.com M b.png 1999-11-22 지금
        String query = " INSERT INTO t_member VALUES('aaa', '김이박', '1111', 'a@a.com', 'F', 'a.png', '1999-09-09', NOW()) ";

       query = """
                INSERT INTO t_member(mid, mname, mpw, email, gender, birth_date)
                VALUES('bbb', '김비비', '1111', 'b@b.com', 'M', '1999-11-22')
                """;

        try {
            stmt = con.createStatement(); // 쿼리 실행할 객체 생성
            int result = stmt.executeUpdate(query); // 쿼리 실행
            if (result == 1) {
                System.out.println("insert success!");
            } else {
                System.out.println("insert failed!");
            }
        }catch (SQLException e) {
           // throw new RuntimeException(e);
            System.err.println("Insert failed!");
            System.err.println(e.getSQLState() +" || "+  e.getErrorCode() + " || " + e.getMessage());

        } finally {
            // 예외 발생 여부와 관계없이 항상 실행 해야 함
            // 스테이트 먼트 닫기
            try {
                stmt.close(); // 쿼리 실행 객체 닫기,
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void select(){   //t_member 테이블의 회원아이디가 aaa인 레코드 조회 ----
        String query = " SELECT * FROM t_member WHERE mid = 'aaa' ";
    }
    public void selectAll(){ //t_member 테이블의 모든 레코드 조회 ----------------
        String query = " SELECT * FROM t_member ";
    }
    public void update(){    //t_member 테이블의 회원아이디가 bbb인 레코드 변경 ----
        //이메일 : bbb@bbb.com, 사진 : b.png
        String query =  " UPDATE t_member " +
                " SET    email = 'bbb@bbb.com', photo = 'b.png' " +
                " WHERE  mid = 'bbb' ";
    }
    public void delete(){   //t_member 테이블의 회원아이디가 bbb인 레코드 삭제 ----
        String query = " DELETE FROM t_member WHERE mid = 'bbb' ";
    }



    public static void main(String[] args) {
        JDBCTest jdbcTest = new JDBCTest();
        jdbcTest.insert();


    }

}

//// 디비에 선 삽입
//INSERT INTO t_member VALUES(
//        'aaa', '김이박', '1111', 'a@a.com',
//        'F', 'a.png', '1999-09-09', NOW());
//)
//// 테이블 정의 당시 순서와 인설트 데이터 순서가 동일하면 칼럼이름 생략가능
//
//INSERT INTO t_member(mid, mname, mqw, email, gender
//                     , birth_date)
//    VALUES('aaa', '김이박', '1111', 'a@a.com', 'F', '1999-09-09');


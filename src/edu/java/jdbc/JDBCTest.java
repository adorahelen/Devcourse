package edu.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    private Connection con;

    public JDBCTest() {
        String url = "jdbc:mysql://localhost:3306/modeldb";
        // MySQl 접속 정보 및 스키마(디비) 선택

        String username = "root"; // 접속 계정
        String password = "12345678";// 비밀번호

        // MySQl DB 접속 - Connection 객체 생성, 인터페이스라서 뉴 못함
        Connection con = null;
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
        String query = " INSERT INTO t_member VALUES('aaa', '김이박', '1111', 'a@a.com', " +
                " 'F', 'a.png', '1999-09-09', NOW()) ";

        query = """
                INSERT INTO t_member(mid, mname, mpw, email, gender, birth_date)
                VALUES('bbb', '김비비', '1111', 'b@b.com', 'M', '1999-11-22')
                """;
    }

    public void select(){ // 조회 : 회원아이디가 aaa인 레코드
        String query ="";
    }

    public void update(){ // bbb record change
        String query ="";
    }
    public void delete(){
        String query ="";
    }
    public void selectALL(){
        String query ="";
    }



    public static void main(String[] args) {}

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


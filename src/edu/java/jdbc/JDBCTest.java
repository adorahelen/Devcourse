package edu.java.jdbc;

import java.sql.*;

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
               if(stmt != null) stmt.close(); // 쿼리 실행 객체 닫기,
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void select(String id){   //t_member 테이블의 회원아이디가 aaa인 레코드 조회 ----
        String query = " SELECT * FROM t_member WHERE mid = ? ";
        ResultSet rs = null;
        // sql  prepare 자동 문 했던거 발전형
        try (PreparedStatement pstmt // 쿼리 실행 객체 생성
                     = con.prepareStatement(query) ) { // 쿼리문을 미리 준비
            pstmt.setString(1, id); // 쿼리 값 바인딩
            rs = pstmt.executeQuery(); // 레코드 받기

            if (rs.next()) {
                System.out.println("----화원 정보----");
                System.out.println("회원 아이디 : " + rs.getString("mid"));
                System.out.println("회원 이름 : " + rs.getString("mname"));
                System.out.println(" email : " + rs.getString("email"));
                System.out.println("gender : " + rs.getString("gender"));
                System.out.println("pothose :" + rs.getString("photo"));
                System.out.println("birth_date : " + rs.getString("birth_date"));
                System.out.println("join date : " + rs.getString("join_date"));
            } else {
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null)
                {
                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }



    public void selectAll(){ //t_member 테이블의 모든 레코드 조회 ----------------
        String query = " SELECT * FROM t_member ";

//        System.out.println("==============");
//        System.out.println("id and name and email and date");
//        System.out.println("==============");
//
//
//        ResultSet rs = null;
//        try {
//            PreparedStatement pstmt
//                    = con.prepareStatement(query){
//                rs = pstmt.executeQuery();
//
//                while(rs.next() ) {
//                    System.out.println(rs.getString("mid"));
//                    System.out.println(rs.getString("name"));
//                    System.out.println(rs.getString("email"));
//                    System.out.println("Join_date");
//
//                }
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            } finally {
//                try {
//                    if (rs != null)
//                    {
//                        rs.close();
//                    }
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//
//      * select all 부분 왜 망한거지?




    }




    public void update(){    //t_member 테이블의 회원아이디가 bbb인 레코드 변경 ----
        String query =  " UPDATE t_member " +
                " SET    email = 'bbb@bbb.com', photo = 'b.png' " +
                " WHERE  mid = 'bbb' ";

        //이메일 : bbb@bbb.com, 사진 : b.png

        // try with resoureces method
        // = dont need more than
        //쿼리 실행 객체 생성 중
        // 트라이 윗스 리소시스 이용하면 위에 인설트랑 다르게 코드 간략화 가능
        try(Statement stmt = con.createStatement())  {
            int result = stmt.executeUpdate(query);
            if (result == 1) System.out.println("update success!");
            else System.out.println("update failed!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void delete(String id){   //t_member 테이블의 회원아이디가 bbb인 레코드 삭제 ----
       // 회원 아이디를 매개변수로 받아 레코드 삭제
       String query = " DELETE FROM t_member WHERE mid = 'bbb' ";
        query = " DELETE FROM t_member WHERE mid = '" + id + "' ";

        try(Statement stmt = con.createStatement())  {
            int result = stmt.executeUpdate(query);
            if (result == 1) System.out.println("delete success!");
            else System.out.println("delete failed!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



    public static void main(String[] args) {
        JDBCTest jdbcTest = new JDBCTest();
        // jdbcTest.insert();
        // jdbcTest.update();
       // jdbcTest.delete("bbb");
        // jdbcTest.select("aaa");
        jdbcTest.selectAll();


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

/*
* package edu.java.jdbc;

import java.sql.*;

public class JDBCTest {
    private Connection con;     //DB 연결 객체
    private Statement stmt;     //쿼리 실행 객체

    public JDBCTest() {
        String url = "jdbc:mysql://localhost:3306/modeldb"; //mysql 접속 정보 및 스키마 선택
        String username = "root";   //mysql 접속 계정
        String password = "1111";   //      "      의 비밀번호

//      Connection con = null;
        try {
            //Connection 객체 생성 - DriverManager 이용
            con = DriverManager.getConnection(url, username, password);
            System.out.println("con ok!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(){   //t_member 테이블에 레코드 추가 ---------------------
        //회원아이디, 회원이름, 비밀번호, 이메일,   성별, 사진,  생년월일,    가입일자
        //aaa        김이박   1111     a@a.com  F    a.png  1999-09-09  지금
        //bbb        김비비   1111     b@b.com  M           1999-11-22  지금
        String query = " INSERT INTO t_member VALUES('aaa', '김이박', '1111', 'a@a.com', " +
                       " 'F', 'a.png', '1999-09-09', NOW()) ";

        query = """
                 INSERT INTO t_member(mid, mname, mpw, email, gender, birth_date)
                 VALUES('bbb', '김비비', '1111', 'b@b.com', 'M', '1999-11-22')
                """;

        try {
            stmt = con.createStatement();           //쿼리 실행 객체 생성
            int result = stmt.executeUpdate(query); // DML - insert 쿼리 실행
            if( result == 1) { //추가 성공인 경우
                System.out.println("insert ok");
            } else {
                System.out.println("insert not ok");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
//            System.err.println("INSERT 쿼리 실행 실패");
//            System.out.println(e.getSQLState() + " | " +
            //                   e.getErrorCode() + " | " + e.getMessage());
        } finally {     //예외 발생 여부 관계없이 항상 실행
            try {
                if( stmt != null )   stmt.close();    //쿼리 실행 객체 닫기
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void update(){    //t_member 테이블의 회원아이디가 bbb인 레코드 변경 ----
        //이메일 : bbb@bbb.com, 사진 : b.pn
        String query =  " UPDATE t_member SET email = 'bbb@bbb.com', photo = 'b.png' WHERE mid = 'bbb' ";

        try(Statement stmt = con.createStatement() ) { //쿼리 실행 객체 생성- try with resources이용 - 별도의 닫기 처리 불필요
            int result = stmt.executeUpdate(query); // DML - update 쿼리 실행
            if( result == 1)     System.out.println("update ok");       //변경 성공인 경우
            else                 System.out.println("update not ok");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String id){   //회원아이디를 매개변수로 받아 레코드 삭제 ----
        String query = " DELETE FROM t_member WHERE mid = 'bbb' ";
               query = " DELETE FROM t_member WHERE mid = '" + id + "' ";

        try(Statement stmt = con.createStatement() ) { //쿼리 실행 객체 생성- try with resources이용 - 별도의 닫기 처리 불필요
            int result = stmt.executeUpdate(query); // DML - delete 쿼리 실행
            if( result == 1)     System.out.println("delete ok");       //변경 성공인 경우
            else                 System.out.println("delete not ok");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void select(String id){   //매개변수로 넘겨받은 회원아이디의 레코드 조회 ----
        String query = " SELECT * FROM t_member WHERE mid = ? ";
        ResultSet rs = null;
        try( PreparedStatement pstmt                //쿼리 실행 객체 생성
                 = con.prepareStatement(query) ) {  //쿼리문을 미리 준비
            pstmt.setString(1, id);         //쿼리의 물음표에 해당하는 값 바인딩
            rs = pstmt.executeQuery();    //쿼리 실행하고 결과 레코드 받기

            if( rs.next()  ) { //읽어올 값이 있는지 확인
                System.out.println("----- 회원 정보 -----");
                System.out.println("회원 아이디 : " + rs.getString("mid"));
                System.out.println("회원 이름 : " + rs.getString("mname"));
                System.out.println("이메일 : " + rs.getString("email"));
                System.out.println("성별 : " + rs.getString("gender"));
                System.out.println("사진 : " + rs.getString("photo"));
                System.out.println("생년월일 : " + rs.getString("birth_date"));
                System.out.println("가입일자 : " + rs.getString("join_date"));
            } else {           //읽어올 값이 없는 경우
                System.out.println("- 일치하는 회원 정보가 없습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if( rs != null )   rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void selectAll(){ //t_member 테이블의 모든 레코드 조회 ----------------
        String query = " SELECT * FROM t_member ";
    }

    public static void main(String[] args) {
        JDBCTest jt = new JDBCTest();
        //id aaa를 매개변수로 전달하여 select 메서드 호출
        jt.select("aaa");

//      jt.delete("bbb");
//      jt.update();
//      jt.insert();
    }
}
* */
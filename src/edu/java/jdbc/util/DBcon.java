package edu.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
    // 1. 데이터베이스 연결 공유 객체를 클래스 외부에서 접근할 수 없도록 선언
    private  static Connection con;
    // 2. 기본생성자를 선언하여 클래스 외부에서 접근할 수 없도록 처리
    private DBcon() {}


    // 3. 필드로 선언된 객체를 반환하는 클래스 메서드 getConnection 작성
    //      단, 필드가 null인 경우에는 객체를 생성하여 반환하도록 처리
    public static Connection getConnection() {
        if(con == null) {
            String url = "jdbc:mysql://localhost:3306/modeldb";
            String username = "root"; // 접속 계정
            String password = "12345678";// 비밀번호
            try {
                con = DriverManager.
                        getConnection(url, username, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    } // 싱글톤 패턴으로 생성, 연결이 끊켰거나 없으면 "겟커넥션!"


    // 4. ResultSet 객체와 PreparedStatement 객체를
    //      매개변수로 받아서 닫는 close 메서드 작성

    // 5. ReslutSet 객체와 Statement 객체를 매개변수로 받아서
    //      닫는 close 메서드 오버로딩

    // 6. PreparedStatement 객체를 매개변수로 받아서 닫는
        // Close 메서드 오버로딩

    // 7. 필드로 선언된 객체를 닫는 close 메서드 오버로딩



    /* 디비에서 연결을 위한 커넥트 객체

    * */



}

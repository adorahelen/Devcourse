package edu.java.jdbc;

import java.sql.Connection;

public class JDBCTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/modeldb";
        // MySQl 접속 정보 및 스키마(디비) 선택

        String username = "root"; // 접속 계정
        String password = "12345678";// 비밀번호

        // MySQl DB 접속 - Connection 객체 생성
        Connection con =
    }

}

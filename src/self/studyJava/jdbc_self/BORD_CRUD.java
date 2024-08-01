package self.studyJava.jdbc_self;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BORD_CRUD {


    // Field
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // Constructor
    public BORD_CRUD() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/thisisjava",
//                    "java",
//                    "mysql"
//            );
//        } catch (Exception e) {
//            e.printStackTrace();
//            exit();
//        }
        String url = "jdbc:mysql://localhost:3306/modeldb";
        // MySQl 접속 정보 및 스키마(디비) 선택

        String username = "root"; // 접속 계정
        String password = "12345678";// 비밀번호

        // MySQl DB 접속 - Connection 객체 생성, 인터페이스라서 뉴 못함
        // Connection con = null;
        try {      // 그래서 드라이버 매니저를 이용
            conn = DriverManager.
                    getConnection(url, username, password);
            System.out.println("connection OK!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Method

    public void list() {
        System.out.println();
        System.out.println("[BORD LIST]");
        System.out.println("-----------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-----------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s \n",
                "1", "winter", "2022.01.27", "게시판에 오신 것을 환영합니다.");
        System.out.printf("%-6s%-12s%-16s%-40s \n",
                "2", "winter", "2022.01.27", "올 겨울은 많이 춥습니다.");
        mainMenu();
    }

    private void mainMenu() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("[MAIN MENU] : 1. Create | 2. Update | 3. Delete | 4. Exit");
        System.out.println("MENU CHOICE : ");
        String menuChoice = scanner.nextLine();
        System.out.println();

        switch (menuChoice) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    private void create() {
        System.out.println("create() Method Run ! ");
        list();
    }
    private void read() {
        System.out.println("read() Method Run ! ");
        list();
    }
    private void clear() {
        System.out.println("clear() Method Run ! ");
        list();
    }
    private void exit() {
        System.exit(0);
    }



    public static void main(String[] args) {
        BORD_CRUD bord = new BORD_CRUD();
        bord.list();
    }
}

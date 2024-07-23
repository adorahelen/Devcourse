package self.studyJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ScannerMain2 {
    public static void main(String[] args) {
        try {
            System.out.println("웹페이지 크롤링");
            String url = "https://www.cu.ac.kr/index.php";
            URLConnection connection = new URL(url).openConnection();

            // BufferedReader를 사용하여 URLConnection으로부터 데이터를 읽어옵니다.
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            // 읽어온 데이터를 한 줄씩 출력합니다.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // BufferedReader를 닫아줍니다.
            reader.close();

        } catch (IOException e) {
            // 예외 처리: 연결 실패나 데이터 읽기 실패 시 예외 메시지를 출력합니다.
            System.out.println("웹페이지를 읽어오는데 실패했습니다: " + e.getMessage());
        }
    }
}
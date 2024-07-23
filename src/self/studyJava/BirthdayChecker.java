package self.studyJava;
import java.time.LocalDate;

public class BirthdayChecker {
    // 사용자 정의 예외 클래스
    public static class BirthDayException extends Exception {
        public BirthDayException() {}
        public BirthDayException(String message) {
            super(message);
        }
    }

    // 메인 메서드
    public static void main(String[] args) {
        try {
            checkBirthday();
        } catch (BirthDayException e) {
            System.out.println(e.getMessage());
        }
    }

    // 생일 체크 메서드
    public static void checkBirthday() throws BirthDayException {
        LocalDate today = LocalDate.now();
        // 생일인 7월 24일을 정의
        LocalDate birthday = LocalDate.of(today.getYear(), 7, 24);

        if (!today.equals(birthday)) {
            throw new BirthDayException("오늘은 생일이 아닙니다. 생일을 건너뛰었습니다.");
        } else {
            System.out.println("생일 축하합니다!");
        }
    }
}
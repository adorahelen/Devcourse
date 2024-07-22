package self.studyJava;

public class Day_0722 {
    /*
    * 1. 접근 제한자
    * : 경우에 따라서 객체의 필드를 외부에서 변경하거나 ,
    * 메소드를 호출 할 수 없도록 막아야 할 필요가 있다.
    *  => 객체의 무결성 유지 (중요한 필드와 메소드가 외부로 노출되지 않도록)
    *
    * 캡슐화 개념의 일종이며,
    * 외부 객체 ======>     노출메소드 (호출가능) + (읽기 쓰기 가능)
    *                     숨긴필드, 숨긴메소드 (읽기 쓰기 불가능, 호출 불가능)
    *
    * (아래로 내려갈 수록, 접근제한이 강화된다.)
    * public                                없음
    * protected                             같은 패키지 || 자식 객체
    * default *이건 접근제한자가 붙지 않은 상태  : 제한 범위는 같은 패키지
    * private                                객체 내부
    *
    *==> 클래스를 선언할 때 public 접근 제한자 생략하면 디폴트가 되고 다흔 패키지에선 사용 못함
    *
    *
    * Getter & Setter
    * 객체의 필드 (데이터)를 외부에서 마음대로 읽고 변경할 경우
    * 객체의 무결성이 깨진다.
    * 그래서 객체지향 프로그래밍에서는 직접적입 필드 접근( 대입 연산자 사용)을 막고
    * 메소드를 통해 필드에 접근하게 한다.
    * => 이유 : 메소드를 통해 데이터를 검증할 수 있고 유효한 값만 저장시키는게 가능해서
    *
    * */
        private  double speed;
        public void setSpeed(double speed) {
            if (speed < 0) {
                this.speed = 0;
                return;
            }else {
                this.speed = speed;
            }// 이렇듯 매개값이 음수일 경우 0을 저장시킬 수 있다.

            //외부에서 객체의 필드를 읽을 때에도 메소드가 필요한 경우가 있다.
            // 필드값이 객체 외부에서 사용하기에 부적절한 경우,
            // 메소드를 통해 적절한 값으로 변환한 다음 리턴할 수 있기 때문이다.
            // 이러한 역할을 하는 메소드가 getter이다.
        }
        private double speeed2;
        public double getSpeed2() {
            double km = speed * 1.6;
            return km;
    }// 외부에서 읽지 못하는 speed필드를 읽어서 변환시키고 외부로 리턴

        private String fieldName;

        public String getFieldName() {
            return fieldName;
        }
        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        private boolean stop;

        public boolean isStop() {// 불리안 타입은 0또는1로 반환 할 것
            return stop;
        }

    public double getSpeed() {
        return speed;
    }

    public double getSpeeed2() {
        return speeed2;
    }
    // 싱글톤 복습
    // 핵심은 생성자를 private 접근 제한해 외부에서 new 연산자로 생성자를 호출 못하게 하는 것

}

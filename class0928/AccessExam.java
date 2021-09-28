package class0928;

public class AccessExam {
    /*
    접근 제어자
        외부에서 접근하지 못하도록 제한하는 역할을 한다.
    접근 제어자는 클래스, 멤버변수, 메소드, 생성자

    private     - 같은 클래스 내에서만 접근 가능.
    (default)   - 같은 패키지 내에서만 접근 가능.(디렉토리)
    protected   - 같은 패키지 내에서도 , 다른 패키지의 자손클래스에서는 접근 가능.
    public      - 접근 제한 없음.

    public > protected > (default) > private

    클래스 : public, (default)
    메소드, 멤버변수 : public protected (default) private
    지역변수 : 없음

    클래스나 멤버, 주로 멤버에 접근 제어자를 사용하는 이유는 클래스 내부의 선언된 데이터를
    보호하기 위해서이다. 데이터가 유효한 값을 유지할 수 있도록 또는 비밀번호와 같은
    중요한 데이터를 외부에서 함부로 변경하지 못하게 외부로부터의 접근을 제한하는 것이 필요하다.

    외부에서 접근할 필요가 없는 멤버들은 private 로 지정하여 외부에 노출을 막음으로
    복잡성을 줄일 수 있다.(캡슐화)

    public class Time{
        public int hour;
        public int minute;
        public int second;
    }
        이렇게 모두 public 접근제한자가 설정되어 있다면
            
            Time t = new Time();
            t.hour = 25;

        이렇게 외부에서 잘못된 값을 지정해도 막을 방법이 없다.
        이런 경우 멤버 변수는 private 이나 protected 로 제한하고 멤버 변수의
        값을 읽고 변경할 수 있는 메소드를 public 으로 제공하면 간접적으로 멤버변수의 값을
        다룰 수 있도록 하는 것이 바람직하다.

    
    */
}

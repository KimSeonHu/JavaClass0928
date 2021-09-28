package class0928;

public class SuperExam {
    //super : 자식 클래스에서 부모 클래스를 가리키는 예약어이다.
        //멤버 변수와 지역변수의 이름이 같을 때 this 를 붙여서 구별했듯이
        //상속받은 멤버와 자기 자신의 멤버 이름이 같은 경우 super로 구별할 수 있다.
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
    }

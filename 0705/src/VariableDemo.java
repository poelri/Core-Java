public class VariableDemo {

    int eng = 100; // instance variable
    static int math = 80; // class variable 위치나 목적에 따라서 변수를 3개로 나눌수있다~

    public static void main(String[] args) {
        int kor = 100; // local variable 메인사이에 만들어졌우니까 지역변수얌 ㅋ 자바는 모든 코드를 클래스안에 넣어야징~
        System.out.printf(" 수학 점수 = %d\n", Demo.math); // math가 두개일때 어디껄 쓸껀데? Demo 소속 math 쓸게염
        System.out.printf(" 국어 점수 = %d\n", kor);

        VariableDemo vd = new VariableDemo();// 땅을 사서 건물을 지을고얌 등기 ㄱㄱ 주소 vd를 찾아서 varibleDemo를 찾아가면 eng가 있는거임
        System.out.printf(" 영어 점수 = %d\n", vd.eng); // 주소를 알고 있는 vd를 통해서 주소인 eng를 찾아감

        Demo d = new Demo();
        System.out.printf(" 영어 점수 = %d\n", d.eng); // 주소를 알고 있는 vd를 통해서 주소인 eng를 찾아감

    }
}
class Demo {
    static int math = 70; // class variable
    int eng = 50; // 멤버variable Demo의 주소로 접근해야 eng를 쓸수있다. 집을 지어야 얘를 쓸수 있어!
}

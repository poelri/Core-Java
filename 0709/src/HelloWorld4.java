public class HelloWorld4 {
    /*
      다른 클래스에 있는 멤버 변수는 속해 있는 클래스를 생성하고 그 주소로 접근한다
     */
        public static void main(String[] args) {
            Test t = new Test();
            System.out.println(t.str); // 테스트 주소를 알아야 접근하지. 테스트 주소는 테스트를 만들때 나옴
        }
}
    class Test{
        String str = "Hello,World";
    }


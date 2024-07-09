public class HelloWorld1 {
     /*
        동일 클래스에 있는 스태틱 변수는 클래스 이름을 생략할 수 있다.
     */
    static String str = "Hello, World";
    // instance | member variable -> class | static variable 공유 변수로 만들어줘어 해서 static을 적어주면 ok
        public static void main(String[] args) {
          //  String str = "Hello, World"; // local | stack | temporary | auto variable 지역변수는 메모리 스택에 자동으로 만들어지고 자동으로 소멸된다.
            System.out.println(HelloWorld1.str);
            System.out.println(Demo.str);
        }
}
    class Demo{
        static String str = "Python이 대세야!! ";
}
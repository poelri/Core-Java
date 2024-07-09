public class HelloWorld3 {
    /*
        다른 클래스에 있는 스태틱 변수는 속해 있는 클래스 이름으로 접근한다.
    */
    public static void main(String[] args) {
        System.out.println(Demo.str);
    }
    class Demo{
        static String str = "Hello, World";
    }
}

public class HelloWorld2 {
    /*
      동일 클래스에 있는 멤버 변수는 반드시 해당 클랙스를 생성해서 그 주소로 접근해야 한다.
    */
    static String str = "Hello, World";

    public static void main(String[] args) {
        HelloWorld2 hw = new HelloWorld2();
        System.out.println(hw.str);
    }
}

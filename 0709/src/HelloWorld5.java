public class HelloWorld5 {
     /*
        동일 클래스의 스태틱 메소드는 클래스 이름을 생략할 수 있다. 스태틱은 스태틱끼리 접근 할 수 있다.
     */
    public static void main(String[] args) {
        print();
    }
    static void print(){ // static 또는(|) class method
        System.out.println("Hello,World");
    }
}

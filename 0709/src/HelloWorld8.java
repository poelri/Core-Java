public class HelloWorld8 {
    /*
     다른 클래스의 멤버메소드는 클래스를 생성하고 그 주소로 접근한다.
     스태틱이 아니면 멤버 메소드. 멤버 메소드는 주소로 접근해야 한다.
    */
    public static void main(String[] args) {
        new Car().print();
    }
}
    class Car {
         void print() { // member 또는(|) instance method
            System.out.println("Hello,World");
        }
}

public class HelloWorld7 {
    /*
     다른 클래스의 스태틱 메소드는 클래스 이름으로 접근한다.
    */
    public static void main(String[] args) {
        Employee.print();
    }
    class Employee {
        static void print() { // static 또는(|) class method
            System.out.println("Hello,World");
        }
    }
}

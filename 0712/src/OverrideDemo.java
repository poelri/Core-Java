public class OverrideDemo {
    public static void main(String[] args) {
        Base parent = new Derived();
//        Object obj = new String("Hello, World");
    }
}
/*
    Public > protected > default > private
    Override 된 자식 메소드의 접근 범위는 부모 메소드보다 같거나 더 넓어야 한다.
*/

class Base{
    protected void display(){System.out.println("나는 엄마얌");}}

class Derived extends Base{
    @Override
    protected void display(){System.out.println("나는 딸내미얌");}}

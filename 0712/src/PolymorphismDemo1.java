/*
 Child : String
 Parent : Object
*/

public class PolymorphismDemo1 {
    public static void main(String[] args) {
//        String str = "Hello World";
//        Object original = str; // 자식이 부모형으로 자동 형변환
//        if(original instanceof String) System.out.println("된다");
//        else System.out.println("안된다");
//         String target = (String)original; // 부모님이 자식으로 강제 형변환
//        System.out.println(target);
//        Child popo = new Child(); popo.display();
        Parent jimin = new Parent();
        Child poel = new Child();
        jimin = poel;
        jimin.display();
    }
}

class Parent{
    public void display(){ System.out.println("나는 부모 메소드");}
}
class Child extends Parent{
    @Override
    public void display(){ System.out.println("나는 자식 메소드");}
}

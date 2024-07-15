//// 1. overshadow 변수, override 메소드는 상속되지 않는다.
//public class InheritanceDemo {
//    public static void main(String[] args) {
//        Horse h = new Horse();
//        // h.display();
//        System.out.println(h.toString());
//        // toString은 Horse@41629346 으로 출력됐다. 재정의한 후에는?
//    }
//}
//class Mammal {
//    public void display(){
//        System.out.println("나는 포유류");
//    }
//}
//class Horse extends Mammal {
//    @Override
//    public String toString(){
//        return "나는 제주말입니다";
//        // toString을 재정의 하고 나서는 나는제주말입니다 라고 출력된다.
//    }
//
//    @Override // 재정의 하려는고야. 원래는 나는 포유류 였지만 나는 horse의 display니까 제주말이 나와야해
//    public void display(){
//        super.display();
//        System.out.println("나는 제주말이야.");
//    }
//}

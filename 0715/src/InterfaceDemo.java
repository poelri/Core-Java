//public class InterfaceDemo {
//    public static void main(String[] args) {
        // Mammal m = new Mammal() {
        // interface도 추상클래스처럼 인스턴스화가 안된다.
        // Mammal m = new Dog(); m.display();
        // Mammal m1 = new Cat(); m1.display();
        // Mammal.PI = 3.141596; // 상수이기 때문에 바꿀 수 없다.
        // 하나씩 불러내기 코드가 안예쁘니까, 배열로 바꾸자!
//        Mammal[] array = new Mammal[2]; // 포유류가 들어올 2개의 방을 만드는거라 new 가능
//        array[0] = new Dog();
//        array[1] = new Cat();
//        for (Mammal m : array) m.display();
//        // 향상된 for문 // 몇번 돌지 관심없구 걍 첨부터 끝까지 할꺼임
//    }
//    //public interface Mammal {
//    // 1. public static final이 생략된 상수만 가질 수 있다.
//    //    double PI = 3.141596;
//    // 2. public abstract이 생략된 추상메소드만을 가질 수 있다.
//    //    void display();
//    //}
//}
//
//// 3. interface를 구현시 implements 키워드 사용해야. 이중상속
//class Dog implements Mammal {
//    // 4. interface 추상메소드를 재정의시 반드시 public이어야 한다.
//    @Override
//    public void display() { // 재정의
//        System.out.println("개에 맞게 재정의된 메소드");
//    }
//}
//
//class Cat implements Mammal {
//    @Override
//    public void display() { // 재정의
//        System.out.println("고양이에 맞게 재정의된 메소드");
//    }
//}

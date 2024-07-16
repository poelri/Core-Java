public class FinalDome {
    public static void main(String[] args) {
        Parent bumo = new Jasic();
        bumo.display();
    }
}
class Parent{
    public void display(){
        System.out.println("나는 부모의 메소드");
    }
}

class Jasic extends Parent{
    @Override
    public void display() {
        super.display();
    }
}

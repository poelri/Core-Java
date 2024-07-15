public class Bat extends Mammal implements Birds {
    // 포유류의 자식이면서 조류새끼여야됨
    @Override
    public void fly() {
        System.out.println("하늘을 날다");
    }

    @Override
    public void giveBirthto() {
        System.out.println("새끼를낳다");
    }

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.fly();
        bat.giveBirthto();
    }
}

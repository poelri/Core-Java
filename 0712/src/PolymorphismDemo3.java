public class PolymorphismDemo3 {
    public static void main(String[] args) {
//        Dog [] array = new Dog[3];
//        array[0] = new Cat();
        Mammal [] array = new Mammal[4]; // 포유류의 방이니까 얘네들 다 들어올수있어요
        array[0] = new Dog();
        array[1] = new Cat();
        array[2] = new American();
        array[3] = new Korean();
    }
}

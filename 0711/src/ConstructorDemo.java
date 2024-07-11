public class ConstructorDemo {
    public static void main(String[] args) {
//        Car sonata = new Car();
//        System.out.println(sonata.name);
//        System.out.println(sonata.price);
        Product pencil = new Product("디즈니 리미티드 에디션 연필",10000,"디즈니월드");
        // 순서바뀌면 안되고, 타입도 일치해야하지~
        Product computer = new Product("애플짱비싼 컴퓨터", 6000000,"애플");
    }
}

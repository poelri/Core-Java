public class GenericDemo {
    public static void main(String[] args) {
        // Car carnival = new Car(40_000_000);
        // carnival.setPrice(45_000_000);
        // System.out.println(carnival); // carnival.toString()
        Car<Integer> carnival = new Car<Integer>(45_000_000); // 객체 생성
        System.out.printf("price = %d%n", carnival.getPrice());
        Car<String> matiz = new Car<String>("10000000");  // 객체 생성
        System.out.printf("price = %s%n", matiz.getPrice());
        Car<Double> sonata = new Car<Double>(45_000_000.0);  // 객체 생성
        System.out.printf("price = %f%n",sonata.getPrice());
    }
}
class Car<T> {
    private T price; // 필드  타입의 가격 정보를 저장


    public Car(T price) {  // 생성자 객체 생성 시 가격 정보를 초기화
        this.price = price;
    }

    public T getPrice() { // 메소드 가격 정보를 반환
        return price;
    }

    public void setPrice(T price) { // 메소드 가격 정보를 설정
        this.price = price;
    }
}

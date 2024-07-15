public interface InterfaceDemo1 {
    public static void main(String[] args) {
        Car sonata = new Car("EF소나타", 30_000_000);
        Car matiz = new Car("RedMatiz", 10_000_000);
        // sonata - matiz 소나타에서 마티즈를 빼고 싶어~ 가격으로 비교 할꺼야! !
        int result = sonata.compareTo(matiz); // 내가 소나타고, 들어오는 값이 마티즈
        System.out.println(result);
    }
}
// Comparabla은 <>이 기호를 써야하고 , 그 안에는 타입을 써야한다
class Car implements Comparable<Car>{ // 자동차가 비교할 능력이 된다면
    private String name;
    private int price;
    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car other) { // 나와 파라메터로 들어온 값을 비교한다. 내가 other를 뺀다.
        return this.price - other.price; // 나에서 들어온 애를 뺀다.
    }
}

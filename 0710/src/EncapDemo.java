public class EncapDemo {
    public static void main(String[] args) {
        Car sonata = new Car();
//        sonata.name = "포엘 소나타";
//        sonata.price = 30_000_000;
        sonata.setName("현대 소나타"); sonata.setPrice(30_000_000);
//        System.out.printf("이름 = %s, 가격 = %d%n", sonata.name, sonata.price);
        System.out.printf("이름 =%s%n, 가격 = %d%n", sonata.getName(),sonata.getPrice());
    }
}
class Car{
   private String name;
   private int price;
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
    public int getPrice() { return price;}
    public void setPrice(int price) { this.price = price;} // this 나의~주소
}

public class Product {
    String name ;
    int price ;
    String maker;
//    public Product(){ // Default constructor 기본생성자
//        this.name = null;
//        this.price = 0;
//        this.maker = null;
//    }
    public Product(String name, int price, String maker){ // Constructor
        this.name = name;
        this.price = price;
        this.maker = maker;
    }
}

class Product{
    int price;
}
public class MethodDemo2 {
    public static void main(String[] args) {
        MethodDemo2 md = new MethodDemo2();
        Product ballpen= new Product(); ballpen.price = 100;
        System.out.println("before = " + ballpen.price);

        md.change(ballpen); // Call by Reference
//        int original = 100;
//        md.print(original); // Call by Value
        System.out.println("after = " + ballpen.price);
    }
    void change(Product pencil){ //pencil = ballpen
        pencil.price = 50000;
    }
//    void print(int target){ // target = original
//        System.out.println("target = " + target);
//        target = 50000;
//        System.out.println("target = " + target);
//    }
    // original 과 target은 서로 다른 공간이기 때문에 값이 바뀌지 않는다. 남편이 2명인거 주소가 2개임
    // 치명적인 단점이에요~~
}

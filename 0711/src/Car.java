public class Car {
     String name;
     int price;
//     public Car(){
//         this.name= null;
//         this.price= 0;
//     }
    // 기본생성자
    // 컴파일러가 자동으로 코딩하기 때문에 굳이?


    public void setName(String name){
        this.name = name ;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public Car clone(){ // 자동차 복제( 주소 복사 )
        return this;
    }
}

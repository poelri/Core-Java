public class InterfaceDemo2 {
    public static void main(String[] args) {
        Product pencil = new Product("포엘연필");
        //  Product ballpen = pencil; // 주소복사
        //  ballpen.clone();
        Product ballpen = pencil.copy(); // 나 볼펜은 procudt에 가면 copy가 있어~
        //  System.out.println(ballpen.name);
    }
}
class Product extends Object implements Cloneable{ // flag interface
    String name;
    public Product( String name ){ this.name = name; } // 생성자 객체가 생성될 때 호출되어 초기화 작업을 수행
                                                        //    생성자는 다음과 같은 특징
                                                        //    메소드 이름이 클래스 이름과 동일: 생성자는 클래스 이름과 동일한 이름을 가집니다.
                                                        //    리턴 타입이 없음: 생성자는 리턴 타입이 없습니다. 즉, void나 다른 타입을 명시하지 않습니다.
                                                        //    인스턴스화 시 자동 호출: 객체를 생성할 때 new 키워드와 함께 호출됩니다.
    public Product copy(){
        Product target = null;
        try {
            Object obj =this.clone(); // 나를 복제해서 clone에 넣어
            if(obj instanceof Product) target=(Product)obj;
            System.out.println("형변환안됩니당");
        } catch (CloneNotSupportedException e) { // clone이 지원되지 않으면 어떻게 할고니?
            System.out.println("복제 안됩니당~.");
        }
        return target;
    }
}

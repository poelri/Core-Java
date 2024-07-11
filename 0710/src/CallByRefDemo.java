public class CallByRefDemo {
    public static void main(String[] args) {
        CallByRefDemo d = new CallByRefDemo();
        int money = 1000;
        String name = "포포링";
        System.out.printf("Before money = %d, name = %s\n", money, name);
        d.change(money,name);
        System.out.printf("after money = %d, name = %s\n", money, name);
    }
    void change(int su, String str){ // Call by Value
        // static이 없어서 member 메소드~ 주소 필요해요
        // String 자체가 불변형이기 때문에 바뀌지 않는다.
        // String도 참조 타입이므로, 메서드 호출 시 문자열의 참조가 복사
        su *= 5;
        str = "포근";
        System.out.printf("chage money = %d, name = %s\n", su, str);
    }
}

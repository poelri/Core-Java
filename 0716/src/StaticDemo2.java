public class StaticDemo2 {
    private int a; // mamber variable
    private final int B; // member constant
    private static int c;
    private static final int D;
    { // initalization block : 멤버 변수, 멤버 상수 초기화, 객체 생성때마다 자동 호출
        a = 5 ; B = 100;

    }
    static { // static initalization block: 스태틱 변수, 스태틱 상수 초기화; class 로딩시 단 한번 수행
        c = 500 ; D = 1000;
    }
    public static void main(String[] args) {
        System.out.println( c + "," + D);
    }

    void print(){
        int e; // local variable
        final int F; // local constant
    }
}

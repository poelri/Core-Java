public class StaticDemo {
    public static void main(String[] args) {
        Tiger [] array = new Tiger[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Tiger();
        }
        for(Tiger t : array) System.out.println("a = " + t.a + ", b = " + Tiger.b );
    }
}
class Tiger{
    int a; // 멤버는 수 만큼
    static int b; // static은 무조건 1개, 공유변수, 놀이터는 하나야~
    public Tiger(){
        a++;
        b++;
    }
}

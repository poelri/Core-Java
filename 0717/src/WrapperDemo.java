public class WrapperDemo {
    public static void main(String[] args) {
        // brfore JDK 1.5 까지만 이렇게 썼따
        // int su = 5;
        // Integer in = new Integer(su); // Wrapping,Boxing
        // int another = in.intValue()// 내가 알고 있는 주소의 값을 주소로 바꾸는 것 = Unwrapping. Unboxing
        // System.out.println(another);


        // After JDK 1.5
        int su = 5;
        Integer in = su * 100 ; // new Integer(su), Autoboxing
        int another = in; // in.inValue(), Autounboxing
        System.out.println(another);
    }
}

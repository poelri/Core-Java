public class LambdaDemo5 {
    public static void main(String[] args) {

        Person2 popo = new Person2();
        /* 첫번째 방법 : polymorphic parameter를 이용하자*/
        popo.greeting(new Say2(){
            @Override
            public int something(int a){
                System.out.println("I'm popo ...");
                System.out.println("Nice to meet you.");
                return a * 10;
            }
        });

        /* 두번째 방법 : Lambda Expression을 이용하자. */
        popo.greeting((a) -> {
            System.out.println("I'm popo ...");
            System.out.println("Nice to meet you.");
            return a * 100;
        });
    }
}

@FunctionalInterface
interface Say2{
    int something(int a);
}

class Person2{
    public void greeting(Say2 say2){
        int value = say2.something(5);
        System.out.println("value =" + value);
    }
}

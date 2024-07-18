public class LambdaDemo4 {
    public static void main(String[] args) {

        Person1 popo = new Person1();
        /* 첫번째 방법 : polymorphic parameter를 이용하자*/
        popo.greeting(new Say1(){
            @Override
            public int something(){
                System.out.println("I'm popo ...");
                System.out.println("Nice to meet you.");
                return 100;
            }
        });

        /* 두번째 방법 : Lambda Expression을 이용하자. */
        popo.greeting(() -> {
                    System.out.println("I'm popo ...");
                    System.out.println("Nice to meet you.");
                    return 200;
                });
    }
}

@FunctionalInterface
interface Say1{
    int something();
}

class Person1{
    public void greeting(Say1 say1){
        int value = say1.something();
        System.out.println("value =" + value);
    }
}

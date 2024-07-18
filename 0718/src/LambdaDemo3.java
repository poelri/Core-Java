public class LambdaDemo3 {
    public static void main(String[] args) {

        Person popo = new Person();
        /* 첫번째 방법 : polymorphic parameter를 이용하자
        popo.greeting(new Say(){
            @Override
            public void something(){
                System.out.println("I'm popo ...");
                System.out.println("Nice to meet you.");
            }
        });

         */

        /* 두번째 방법 : Lambda Expression을 이용하자. */
        popo.greeting(() -> {
                System.out.println("I'm popo ...");
                System.out.println("Nice to meet you.");
            }
        );
    }
}

@FunctionalInterface
interface Say{
    void something();
}

class Person{
    public void greeting(Say say){
        say.something();
    }
}

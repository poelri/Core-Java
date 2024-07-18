public class LambdaDemo6 {
    public static void main(String[] args) {

        Person3 popo = new Person3();
        /* 첫번째 방법 : polymorphic parameter를 이용하자*/
        popo.greeting(new Say3(){
            @Override
            public int something(int a, int b){
                System.out.println("I'm popo ...");
                System.out.println("Nice to meet you.");
                return a + b;
            }
        });

        /* 두번째 방법 : Lambda Expression을 이용하자. */
        popo.greeting((a,b) -> {
            System.out.println("I'm popo ...");
            System.out.println("Nice to meet you.");
            return a + b;
        });
    }
}

@FunctionalInterface
interface Say3{
    int something(int a, int b);
}

class Person3{
    public void greeting(Say3 say3){
        int value = say3.something(5,10);
        System.out.println("value =" + value);
    }
}

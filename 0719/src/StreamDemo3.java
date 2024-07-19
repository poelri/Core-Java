import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/*
* 중간연산 : filter(), map()
* 최종연산 : count(), sum(), max(), min(), average(), reduce(), forEach()
* filter(조건) : 중간연산
* map() : 중간연산
*  */
public class StreamDemo3 {
    public static void main(String[] args) {
        // 배열 array에서 길이가 5 이상인 요소는 "Hello"와 "Java Language" 두 개 출력
        String [] array = {"abc","Hello","Hi~","Java Language"};
        Stream<String> sStream = Stream.of(array); // 배열에서 스트림 생성
        sStream.filter(str ->str.length() >= 5).forEach(s ->System.out.println(s+"\t"));

        // 리스트에서 Customer 객체 생성 및 스트림 사용
        List<Customer> list = new ArrayList<Customer>();
        Customer c1 = new Customer("포엘", 10); list.add(c1);
        Customer c2 = new Customer("포포링", 20); list.add(c2);
        Customer c3 = new Customer("포로리", 30); list.add(c3);
        Customer c4 = new Customer("포포", 40); list.add(c4);
        Stream<Customer> customList=list.stream(); // 리스트에서 스트림 생성
        customList.map(c ->c.getName()).forEach(s->System.out.println(s));
    }
}

class Customer{
    private String name;
    private int age;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        //
        // // HashSet을 생성하여 중복을 제거하고 요소를 저장
        // Set<String> set  = new HashSet<String>();
        // for(String element : array) set.add(element);
        //
        // // bulk로 데이터를 추출하고자 할 때, Enumeration, Iterator
        // // Iterator를 사용하여 HashSet의 요소들을 순회하며 출력
        // Iterator<String> iters =  set.iterator();
        // while(iters.hasNext()) {
        //     System.out.println(iters.next() + ",");
        // }
    Vector<String> vector = new Vector<String>();
    for(String element : array) vector.add(element);
    Enumeration<String> enums = vector.elements();
    while(enums.hasMoreElements()) {
        System.out.println(enums.nextElement() +",");
    }
    }
}

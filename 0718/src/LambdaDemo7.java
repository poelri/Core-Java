/*
* Collection Framework와 Lambda Expression
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo7 {
    public static void main(String[] args) {
       // List<Integer> list =  Arrays.asList(4,7,1,2,9,3,5,8);
        List<String> list = Arrays.asList("한강, 두만강, 낙동강,압록강,영산강, 금강");
       /* 첫번째 방법
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer front, Integer back) {
                return front - back; // Ascending Sort
            }
        });
        System.out.println(list);
        */
        // 두번째 방법
        Collections.sort(list,(front, back) -> front.compareTo(back));
        System.out.println(list);
    }
}

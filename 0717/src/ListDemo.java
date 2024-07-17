import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        Vector<String> vector = new Vector<String>(1,1); // ( 초기용량 , 증가량)

        /////////////////////////////////////////////////////////////////////////////////////
        // String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        // List<String> list = new ArrayList<String>(5); // 방 10개 생성
        // for (String element : array) { // String element를 배열에서 뽑아내자}
        //     list.add(element);
        // }
        // System.out.println("현재 방갯수 : " + list.size());
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);
        // System.out.println(list.get(1));
    }
}

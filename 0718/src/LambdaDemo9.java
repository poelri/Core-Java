import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LambdaDemo9 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Language", "java");
        map.put("DB", "MySQL");
        map.put("Framework","Spring Boot");
        map.put("Frontend","React");
        map.put("Cloud","AWS");
        /*  첫번째 방법 Map에 저장된 Key를 이용하여 각 Value 출력하기
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(key + " => " + map.get(key));
        }
        */
        /* 두번재 방법 */
        map.forEach((key, value) -> System.out.println(key+"=>"+value));

    }
}

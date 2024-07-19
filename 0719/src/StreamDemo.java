import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 100).sum(); // sum() 메서드는 스트림의 모든 요소를 합산합니다.
        // int sum1 = IntStream.range(1, 101).sum(); IntSream을 이용한 합과 개수 계산.
        long count = IntStream.rangeClosed(1, 100).count(); // count() 메서드는 스트림의 요소 개수를 세어줍니다.
        // System.out.println(sum + "," + count);

        // 1.0~ 100.0까지 난수 15개 중 최댓값은?
        OptionalDouble max = new Random().doubles(15L, 1.0,100.0).max();
        // OptionalDouble은 값이 있을 수도 없을 수도 있는 값을 감싸는 컨테이너
        System.out.println(max.getAsDouble());
    }
}

import java.util.Scanner;

public class OpDemo {
    public static void main(String[] args) {
//        short su = 5;
//        short result = (short) ~su;
//        short result = ~su; 이건 오류나 int이기 때문에

//        short result = true ? 1970 : 3.14;
// 조건이 참이라서 어차피 1970이 들어가도 3.14는 에러가 난다~
// 삼항연산자는 조건을 먼저 보지않고, 참과 거짓의 값을 먼저 비교하기 때문에

    Scanner sc = new Scanner(System.in);
    System.out.print("값 입력(초단위) : " );
    int time = sc.nextInt();
    int hour = time / 3600;
    int minute = time % 3600 / 60;
    int second = time % 3600 %60;
    System.out.println(time + " 초는" + hour + "시간" + minute + "분" + second +"초");



    }
}

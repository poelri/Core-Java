import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        // A ~ Z 까지 출력하기
        int i = 65; // initialization
        for (; i <= 90; ) {
            System.out.printf("%c\t", (char) i);
            i++;
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int j = 1;
        int count = 0;
        for (; j <= 100; j++) {
            if (j % 4 == 0) {
                count++;
            }
        }
        System.out.println("4의 배수는 " + count + "개 입니다");


        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0 ||( year % 4 == 0 && year % 100 != 0)) {
            System.out.println("윤년입니당");
        } else {
            System.out.println("윤년아닙니당");
        }
    }
}




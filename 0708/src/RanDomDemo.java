import java.util.Scanner;

public class RanDomDemo {
    public static void main(String[] args) {
        // 1 ~ 10 까지의 랜덤 넘버 추출
        int rand = (int) (Math.random() * 10 + 1);
        System.out.println("rand = " + rand );
        switch (rand) {
            case 1:
                System.out.println("Banana"); break;
            case 2:
                System.out.println("Orange"); break;
            case 3:
                System.out.println("Peach");
            case 4:
                System.out.println("Apples");
            case 5:
                System.out.println("Plum"); break;
            case 6:
                System.out.println("Pineapples"); break;
            case 7:
                System.out.println();break;
            default:
                System.out.println("Nuts");
        }

        // A ~ Z 까지 출력하기
        int i = 65; // initialization 대문자 A
        int j = 97; // 소문자 a

        for (; i <= 90; ) {
            System.out.printf("%c\t", (char) i);
            i++;
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }
}

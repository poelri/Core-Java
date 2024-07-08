import java.util.Arrays;
import java.util.Scanner;

public class ConditionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("신장(cm) : ");
        double height = sc.nextDouble();

        System.out.print("몸무게(kg) : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height) * 10000;

        if (bmi < 18.5) {
            System.out.println( name + "님은 BMI 지수가 " + bmi + "이고 저체중입니다");
        }else if (bmi >= 18.5 && bmi <= 22.9) {
            System.out.println( name + "님은 BMI 지수가 " + bmi + "이고 정상입니다");
        }else if(bmi >= 23 && bmi <= 24.9) {
            System.out.println( name + "님은 BMI 지수가 " + bmi + "이고 과체중입니다");
        } else{
            System.out.println( name + "님은 BMI 지수가 " + bmi + "이고 비만입니다");
        }
        sc.close();




//        System.out.print("Favorite Season(spring, summer, fall, winter) : ");

//        Scanner sc = new Scanner(System.in);
//        String season = sc.nextLine();
//        switch (season) {
//            case "spring": System.out.println("봄:개나리, 진달래"); break;
//            case "summer": System.out.println("여름: 장미, 아카시아"); break;
//            case "fall": System.out.println("가을: 백합, 코스모스"); break;
//            default: System.out.println("겨울: 동백, 미래");
//        }


//        if(season.equals("spring")) { //equals()는 String class의 멤버 메소드이기 때문에, 주소가 필요하다. heap에 저장하고 주소는 season(8바이트)이 알고 있다.
//            System.out.println("봄: 개나리, 진달래");
//        } else if(season.equals("summer")) {
//            System.out.println("여름: 장미, 아카시아");
//        } else if(season.compareTo("fall") == 0 ) {
//            System.out.println("가을: 백합, 코스모스");
//        } else {
//            System.out.println("겨울: 동백, 미래");
//        }
    }
}

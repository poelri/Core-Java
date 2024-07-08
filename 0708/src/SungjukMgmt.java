public class SungjukMgmt {
    public static void main(String[] args) {
        Student poel = new Student();// instanse로 올리려면 new로 새로 만들어야댐. 무조건 참조형은 8바이트
        // 8바이트 주소 안에 메모리 힙에 있는 주소를 참조한다~ 포엘집을 아는고지~
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String y_n = null; // 초기값~~

        do {
            System.out.print("학번 : ");
            poel.hakbun = sc.next(); // 포엘의 학번에 정확하게 배달~~!! 넣어줘~!
            System.out.print("국어 : ");
            poel.kor = sc.nextInt(); // 포엘의 국어방안에 배달!!
            System.out.print("영어 : ");
            poel.eng = sc.nextInt(); // 포엘의 영어방에 배달!
            System.out.print("수학 : ");
            poel.math = sc.nextInt();

            poel.tot = poel.kor + poel.eng + poel.math; // 포엘의 총점!!
            poel.avg = poel.tot / (double) 3;
            // poel.avg = poel.tot / 3.; 이것도 가능. 분모든 분자든 한쪽은 실수여야 한다.

            poel.grade = '\0'; // 널값.
            switch ((int) (poel.avg / 10)) {
                case 10:
                case 9:
                    poel.grade = 'A';
                    break;
                case 8:
                    poel.grade = 'B';
                    break;
                case 7:
                    poel.grade = 'C';
                    break;
                case 6:
                    poel.grade = 'D';
                    break;
                default:
                    poel.grade = 'F';
            }
            System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%.1f\t%3c%n",
                    poel.hakbun, poel.kor, poel.eng, poel.math, poel.tot, poel.avg, poel.grade);
            System.out.print("Again(y/n)");
            y_n = sc.next();
        } while (y_n.equals("Y") || y_n.equals("y"));
        System.out.println("Program is over....");
    }
}

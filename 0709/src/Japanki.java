public class Japanki {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String y_n = null;
        do {
        System.out.print("Money : ");
        int money = sc.nextInt(); // 145678
            for (int i = 0; i < array.length; i++) {
                int mok = money / array[i];
                System.out.println(array[i] + "원권: " + mok + "장");
                money = money % array[i];
            }
            System.out.println("Again(y/n)? :");
            y_n = sc.next(); // y_n은 do에 속해 있는 지역변수가 아니라 main에 속해 있는 변수다
            y_n = y_n.toLowerCase(); // 소문자로 전환
        }while (y_n.equals("y")); // do 의 지역변수가 아니라서 equals가 활성화 됐음.
        System.out.println("Program is over....");
        }
    }



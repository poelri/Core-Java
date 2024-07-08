public class DoDemo {
    public static void main(String[] args) {
        // 4! = 4 * 3 * 2 * 1
        String y_n =null; // 스트링은 참조형이니까! 초기화!! null 번지(아무것도 참조 하고 있지 않음)
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.print(" 몇 Factorial? : ");
            int su = sc.nextInt();
            int answer = 1;
            for (int i = su; i > 0; i--) {
                answer *= i;
            }
            System.out.println(su + "!=" + answer);
            System.out.println("Again(y/n)?");
            y_n = sc.next(); // y_n은 do에 속해 있는 지역변수가 아니라 main에 속해 있는 변수다
        }while (y_n.equals("Y") || y_n.equals("y")); // do 의 지역변수가 아니라서 equals가 활성화 됐음.
    }
}

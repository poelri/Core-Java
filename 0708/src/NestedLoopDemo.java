public class NestedLoopDemo {
    public static void main(String[] args) {
        int i = 1; // 초기화

        while (i<=9) { // i 조건
            int dan = 2; // dan 초기화
            while (dan <=9){ // dan 조건
                System.out.print(dan + "x" + i + "=" + dan * i + "\t" );
                dan++; // dan 증감식
        }
        System.out.println();
        i++;
        }
    }
}

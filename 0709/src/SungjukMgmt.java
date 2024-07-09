public class SungjukMgmt {
    public static void main(String[] args) {
        int[][] jumsus = {
                {67,89,100},
                {77,99,56},
                {100,99,88}
        };
        for (int i = 0; i < jumsus.length; i++) { // 전체 학생 루프
            int tot = 0;
            for (int j = 0; j < jumsus[i].length; j++) tot += jumsus[i][j];
            // i행 j열을 더함 . 중괄호 안에서 해야할일이 1개뿐이면 생략하능
            double avg = tot / 3.;
            char grade = (avg>=90.0)? 'A' :
                            (avg>=80.0)? 'B':
                                    (avg>=70.0)? 'C':
                                            (avg>=60.0)? 'D': 'F';
            for (int j = 0; j < jumsus[i].length; j++) {
                System.out.printf("%5d\t",jumsus[i][j]);
            }
            System.out.printf("%5d\t%10.1f%5c%n",tot,avg,grade);

        }
    }
}

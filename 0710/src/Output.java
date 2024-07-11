public class Output {
    void output(Student std){ // 계산이 된걸 출력만 할 메소드
        System.out.println("학번\t국어\t수학\t총점\t평균\t평점");
        System.out.println("-----------------------------------------");
        std.print();

//        System.out.printf("%-10s%5d%5d%5d%5d%7.1f%3c%n", // 오른쪽이 정상이라 치고 왼쪽은 마이너스 정렬!!
//                std.hakbun, std.kor, std.eng, std.math, std.tot, std.avg, std.grade);
    }
}

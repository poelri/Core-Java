public class Calc {
    void calc(Student std){ // 입력이 되면 계산만 할 메소드
        int tot = std.getKor() + std.getEng() + std.getMath();
        std.setTot(tot);
        double avg =  tot /3.;
        std.setAvg(avg);
        char grade = (avg >=90)? 'A': (avg >=80)? 'B':
                (avg >=70)? 'C': (avg >=60)? 'D':'F';
        std.setGrade(grade);
    }
}

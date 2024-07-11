public class SungjukMgmt {
    public static void main(String[] args) {
        Student poel = new Student();
        new Input().input(poel); // 입력 할 학생 보내줘
        new Calc().calc(poel); // 계산 할 학생 보내주세요
        new Output().output(poel); // 출력 할 학생 보내세요
    }
}

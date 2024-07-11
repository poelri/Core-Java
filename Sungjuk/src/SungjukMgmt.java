import java.io.FileNotFoundException;

public class SungjukMgmt {
    public static void main(String[] args) throws FileNotFoundException {
        Student [] array = new Student[12]; // 학생 수첩 만들어야징

        Input input = new Input(array); // 입력할 놈
        input.input();

        Calc calc = new Calc(array); // 계산할 놈
        calc.calc();

        Output output = new Output(array); // 출력할 놈
        output.output();

        System.out.println("Program is over..."); // 결국 메인이 하는일은 이거 하나 ㅎㅋ

    }
}
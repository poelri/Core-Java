package com.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SungjukMgmt {
    public static void main(String[] args) throws FileNotFoundException {
        List<StudentVO> list = new ArrayList<StudentVO>(); // 학생 수첩 만들어야징

        Input input = new Input(list); // 입력할 놈
        input.input();

        Calc calc = new Calc(list); // 계산할 놈
        calc.calc();

        // Sort sort = new Sort(list);
        // sort.quickSort();

        Output output = new Output(list); // 출력할 놈
        output.output();

        System.out.println("Program is over..."); // 결국 메인이 하는일은 이거 하나 ㅎㅋ

    }
}
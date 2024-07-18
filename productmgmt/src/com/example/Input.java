package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
    private List<Product> list; // 넘어온 애를 받는 칭구얌
    private Scanner sc;
    private File file;


    public Input(List<Product> list) {
        this.list = list; // 나의 리스트~
        this.file = new File("src/productdata.txt");
        try {
            this.sc = new Scanner(this.file); // 스캐너는 키보드가 아니라 파일을 가르킴.
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 업습니다.");
            System.exit(0); // 강제종료
        }
    }

    public void fileInput() {
        while(this.sc.hasNextLine()){
            String line = this.sc.nextLine(); // 첫번째 라인 읽기  NOTEBOOK	36000	5000	4700	2000
            /*
            * 1. String's split()
            * 2. Scanner's useDelemeter()
            * 3. StringTokenizer
            */
            Scanner scLine = new Scanner(line).useDelimiter("\\s+");
            Product p = new Product(scLine.next(), scLine.nextInt(),
                    scLine.nextInt(), scLine.nextInt(), scLine.nextInt()); // 하나의 제품을 만든당
            this.list.add(p); // 나의 리스트에 제품을 추가하장
            // stack = push , list = add , map = put
        }
    }
}

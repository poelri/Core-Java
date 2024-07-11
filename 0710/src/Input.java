public class Input {
    void input(Student std){ // 입력만 할 메소드야 // std = poel ( 주소복사 ) , Call By Ref 메모리 주소를 전달
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("학번 : "); // 내가 가지고 있는 번지'의' 학번
        String hakbun = sc.next(); std.setHakbun(hakbun);

        System.out.print("국어 : "); std.setKor(sc.nextInt());
        System.out.print("영어 : "); std.setEng(sc.nextInt());
        System.out.print("수학 : "); std.setMath(sc.nextInt());
    }
}

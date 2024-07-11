public class InitializationBlock {
    private double weight; // 멤버변수
    private char grade;
    {
        this.weight = 100.0;
        this.grade = 'F';
    }
    public InitializationBlock(){ //오버라이딩
        System.out.println("나는 생성자");
//        this.weight = 62.4;
//        this.grade = 'C';
    }
    public static void main(String[] args) {
        InitializationBlock poporing = new InitializationBlock();
        System.out.println(poporing.weight + "kg");
        System.out.println(poporing.grade);
    }
}
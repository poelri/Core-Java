
public class MethodDemo4 {
    public static void main(String[] args) {
        MethodDemo4 md=new MethodDemo4();
        int result = md.calcHap(10, 50); // 난 10부터 50까지만 더할래요~~
        System.out.println(result);
        result =  md.calcHap(1, 100);
        System.out.println(result);
        result =  md.calcHap(50, 70);
        System.out.println(result);
    }
    int calcHap(int start, int end){ // member method
        int hap = 0;
        for (int i = start; i <= end; i++) {
            hap += i;
        }
       return hap;
    }
}

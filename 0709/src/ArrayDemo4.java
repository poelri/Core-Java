public class ArrayDemo4 {
    public static void main(String[] args) {
        double [] array = {3.14, 89.5, 182.5, 69.2};

        for (int i = 0; i < array.length; i++) {
            // for 왜써? 시작과 끝이 명료해서 미리 알때 쓰기 좋아
            //   그럼 단점? 미리 알아야해서 그거 모르면 쓰기 빡침
            System.out.printf("%.2f%n", array[i]);
        }

        //Enhanced For 향상된 for문
        for(double aaa:array) { // 몇번 돌지 관심없구 걍 첨부터 끝까지 할꺼임
            System.out.println(aaa);
        }
    }
}

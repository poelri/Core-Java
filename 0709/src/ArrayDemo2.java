public class ArrayDemo2 {
    public static void main(String[] args) {
        // int [][] array; // 2차원 배열 선언
        // array = new int[4][3]; // 2차원 배열의 선언 4행 3열 = 방 12개 , 모두 48개 , 4층에 각 3개씩
        // Rectangular Array
        // 16바이트 주소를 array라는 8바이트 안에 넣어! 배열의 생성
        // array = new int[4][]; // 4층은 정해졌지만 각 층에 몇개의 방을 만들지는 안정함.
        // Jagged(Ragged) Array
        // array[0][0] = 5; // 할당. 0행 0열에 5를 넣으세요~
        //double [] avg = {89.5}; // 중괄호로 초기화
        // int[][] array = {
        //        {1, 2, 3},
        //        {4, 5, 6},
        //        {7, 8, 9},
        //        {10, 11, 12}
        // };
        // int[][] array; // 선언
        // array = new int[4][3]; // 생성
        // array[0] = new int[] {1,2,3};
        // array[1] = new int[] {4,5,6};
        // array[2] = new int[] {7,8,9};
        // array[4] = new int[] {10,11,12};
        int [][] array; // 선언
        array = new int [4][0]; // 생성
        array[0] = new int [] {1,2,3,4} ; // 0층에는 방4개
        array[1] = new int [] {5,6}; // 1층에는 방2개
        array[2] = new int [] {7}; // 2층에는 방1개
        array[3] = new int [] {8,9,10,11,12} ; // 3층에는 방5개

        System.out.println(array.length); // array는 몇층짜리 건물이야? 4
        System.out.println(array[0].length); // 0번째 행의 0번째 열은 방이 몇개야? 4
        System.out.println(array[1].length); // ex) 부산지점은 몇개니? 2

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("array[%d][%d]=%d\t", i, j, array[i][j]);
            }
            System.out.println(); //층은 i 열은 j
        }

        }
}

public class ArrayDemo {
    public static void main(String[] args) {
//        int [] age; // declaration 변수를 선언한다.
//        // 힙에 공간을 만드세요~ age가 정수형 배열이여야대
//        age = new int[4]; //creation
//        age[0] = 6; age[1] = 7; age[2]=8; age[3]=9; // assignment 할당
//
//        char [] array = null;
//        array = new char[] {'a','b','c','d'}; // initialization
//
//        age = 28; // assignment 할당한다.
//        // 선언과 할당을 따로따로 하면 귀찮으니까 한번에 하는 것
//        String name ="아이유"; // initialization 초기화

//        String [] array = {"Hello", "World", "Good", "Java", "A"};

//        int [] array; // declaration
//        array = new int[4]; // creation
//        array[0] = 5; array[1] = 6; array[2] = 7; array[3] = 8; //assignment
//        for (int i = 0; i < 4; i++) {
//            System.out.print("array[" + i + "] = " + array[i] + "\t");
//        }
//        System.out.println();

        String [] array = {"Hello", "World","Good","Java","A"}; // initialization
        array[3] = "python";
        for (int i = 0; i < 5; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}

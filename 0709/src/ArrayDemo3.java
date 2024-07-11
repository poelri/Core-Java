public class ArrayDemo3 {
    public static void main(String[] args) {
//        // 배열의 주소 복사
//        int [] original = {3,4,5};
//        int [] target = original; // original에는 번지가 들어있음. target도 번지가 들어있음. 같은 배열을 original과 target이 똑같은 번지를 참조
//        target[0] = 100; //

          int [] original = {3,4,5};
          int [] target = new int[10];
          System.arraycopy(original,0,target,0,3);
          // 배열의, 몇번째부터, 어디로?, 몇번째부터 ? ,몇개를 가져올꺼야?
        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i]);
        }
    }
}

public class SungjukMgmt1 {
    public static void main(String[] args) throws java.io.IOException {
        Student [] stdArray = new Student[4]; // 앞으로 학생들의 정보가 저장될 공간 확보
        java.util.Scanner sc = new java.util.Scanner(new java.io.File("src/sungjuk.dat")); // 파일의 이름으로 불러들이기

        for (int i = 0; i < 4; i++) {
            stdArray[i]= new Student(); // 비로서 여기서 학생 생성
            String line = sc.nextLine(); // "2024-001"    "포엘"  "100" "80"  "70"
            //Parsing 문자열을 특정 형식이나 구조로 분석하고 해석하는 과정
            String [] array = line.split("\\s+");//잘라서 배열을 만든다 . 주소는 라인이 가지고 있다. 스페이스, 탭, 줄 바꿈, 캐리지 리턴 등이 포함
            stdArray[i].hakbun = array[0].trim(); // 0번째 학생의 학번을 넣고
            stdArray[i].name = array[1].trim(); // 0번째 학생의 이름
            stdArray[i].kor = Integer.parseInt(array[2].trim()); // 국어. 글자 100이 숫자 100으로 변환되고, 양옆에 쓸모없는것들 다 잘라줌
            stdArray[i].eng = Integer.parseInt(array[3].trim()); // 영어. 글자 80이 숫자 80으로 변환되고, 양옆에 쓸모없는것들 다 잘라줌
            stdArray[i].math = Integer.parseInt(array[4].trim()); // 수학. 글자 70이 숫자 70으로 변환되고, 양옆에 쓸모없는것들 다 잘라줌
        }
        int j =0; // 초기값
        while ( j < 4 ){
            System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d%n",
                    stdArray[j].hakbun, stdArray[j].name,
                    stdArray[j].kor, stdArray[j].eng,
                    stdArray[j].math);
            j++;
        }
    }
}
